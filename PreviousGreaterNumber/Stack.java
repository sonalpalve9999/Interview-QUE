package PreviousGreaterNumber;
import java.util.*;
public class Stack {
    int capacity = 1000;                //lets's say Max Capacity for Storing the elements in stack is 1000
    int arr[] = new  int[capacity]; //make string array
    int top;   //top of stack
    int k ;
    Stack(){
        top =-1;
    }

    boolean isempty(){
        return top < 0;
    }
    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack is full");
        }else{
            top =top + 1;             
             arr[top] = data;
         }
    }
    public void pop(){
        if(isempty()){
            System.out.println("Stack is Empty");
        }else{
            top =top - 1;             
    }
}
public int peek(){
    if(isempty()){
        System.out.println("Stack is Empty");
    }else{
       k = arr[top];
}return k;
}

public static void main(String[] args) {
    Stack s = new Stack();
    Scanner sc = new Scanner(System.in); 
    System.out.println("please enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("please enter the numbers one by one ");
    for(int i=0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("the array consisting of Previous smaller elements is");
    for(int i = 0 ;  i < arr.length ; i++){
        while(!s.isempty() && (s.peek() <= arr[i])){
            s.pop();
        }
        if(s.isempty()){
            System.out.print("-1 ");
        }else{
            System.out.print(s.peek()+" ");
        }
        s.push(arr[i]);
    }

}
}
