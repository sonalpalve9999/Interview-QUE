package MajorityElement;
//The problem statement is to find an elemnt present in the array whose frequency is more than
// *(Size of Array/2) in time complexity - O(N) and space complexity- O(1)**************

import java.util.*;
public class MajorityEle {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the size of the Array");
   int size = sc.nextInt();
   int[] arr= new int[size]; 
   System.out.println("Enter the values of array one by one ");
    for(int i= 0 ;  i < arr.length ; i++){ //input the array
        arr[i] = sc.nextInt();
    }
    int index = 0;
    int count = 0;
    for(int i= 0 ; i < arr.length ; i++){ //lets traverse
        if( arr[i] == arr[index]){  //arr[i] == arr[0]
          count = count+1;      //increase the count by 1
        }else{
            count= count-1;   //else if the two elements do not matches with each other decrease count by 1
        }
        if(count == 0){   // now if count = 0
            index = i;    // feed index by the value where the two elemnts do not match 
            count= 1;    // and make the count to 1
        }
    } 
    for(int i=0;i < arr.length ; i++){  //now we got the inde value where there is a possibilty that it is a 
                                        //majority element so check the values which we got at last , appears how many times ?
                                        
        if(arr[i] == arr[index]){ //so arr[i] == arr[index} value which we found at last whose count is atleast >= 1]
            count = count+1;    //check the appearance(how many times the value we got appears in array ) of the element 
                                 //which we found at last of the array .
        }
    }
    if(count > (size/2)){ //now check whether the element's appearance is >= size/2
        System.out.println(" The Majority element in an array is  " + arr[index]); //print the majority element 
    }
    }
}
