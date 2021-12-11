package BalancedBrackets;
import java.util.*;
public class Stack {
    int capacity = 1000;                //lets's say Max Capacity for Storing the elements in stack is 1000
    char arr[] = new  char[capacity]; //make string array
    int top;  
    char t;                    //top of stack
    Stack(){
        top = -1;      //intialize top to -1
    }
    public void push(char c){         //function for pushing the element in stack
        if(top == capacity - 1){
            System.out.println("stack is full");
        }else{
           top =top + 1;             
            arr[top] = c;
        }
    }
    public void pop(){               //function for poping out the element from stack
        if(isEmpty()){                
            System.out.print("Can't pop");  
        }else{
          char a = arr[top];
            top = top-1;
        }
    }
    char peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }else {
         t = arr[top];
        } return t;
    }
    Boolean isEmpty(){                  //function for checking if the stack is empty or not .
        return(top < 0) ;
    }

    Boolean CheckifOpenBracket(char c){    //check if the bracket in the string is opening or not
        return((c == '(') || (c == '{') || (c == '[') ) ; 
    }

    Boolean Balancebracket(char a , char b){   //check if the two brackets from the string is Matching or not
        return((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    boolean isBracketMatching(String k , Stack S){ //Check if the string is balanced or not .
        for(int i =0 ; i < k.length() ; i++ ){  //loop for traversing the string
            char ck = k.charAt(i);         //traverse one by one character and store it oin in char variable
            if(CheckifOpenBracket(ck)){    //check if the obtained character from string is opening bracket or not
                S.push(ck);  //if it is opening bracket then push it in stack
            } 
            else{                //else if it is closing bracket 
                   if(S.isEmpty()){   //check if the stack is empty or not
                    return false;  //if stack is empty return false 
                }
                   else if(!Balancebracket(S.peek(), ck)) { //else if stack is not empty , check if the top of the 
                                                  //stack and the character obtained is the pair of similar opening and closing bracket
                       return false; //if it is not a similar pair return false
                   }
                   else{     //if the pair is similar 
                       S.pop(); //then pop the top i.e opening bracket from stack
                   }
            }
         }
         return S.isEmpty(); //it will return true if the string is balanced and false if the string is not balance
    }
    public static void main(String[] args){ //driver code 
        Stack s = new Stack();             //make the object to point to class stack
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the string Ex.(({})) or (([}))"); //take string input
        String k = sc.nextLine();
        System.out.println( s.isBracketMatching(k, s)); //check whther it it is balanced or not .
    }

}
