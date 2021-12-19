package NextSmallerElement;

//Given an array of integers, find the nearest smaller number for every element such that the smaller 
//element is on right side. 
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
    int b[] = new int[size];
    for(int i = arr.length-1 ;  i >= 0; i--){
        while(!s.isempty() && (s.peek() >= arr[i])){
            s.pop();
        }
        if(s.isempty()){
            b[i] = -1;
        }else{
            b[i] = s.peek();
        }
        s.push(arr[i]);
    }
    for(int i= 0 ; i < b.length ; i++){
        System.out.print(b[i] + " ");
    }

}
}
