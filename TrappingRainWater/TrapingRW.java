package TrappingRainWater;
//Rain water tapping problem is basically a problem which says that suppose you have an array 2,3,4,5,1 and
//in the respective order assume that you have the blocks of building like 
//                 ___5__
//            ___4_|____|
//       ___3_|____|____|
//  __2__|____|____|____|
// |_____|____|____|____|__1__
// |     |    |    |    |    | Now, you have to determine how many blocks of water is been  
// trapped between the empty spaces of building

import java.util.*;
public class TrapingRW {   
    int ans = 0;
    int[] MakeLeft(int[] a , int k){ // a method to form a array to stor the left-max of each element
        int left[] = new int[k];   //make array
        left[0] = a[0];   //assign first element to left array
        for(int i = 1 ; i <a.length ; i++){  // start traversing the array but from index 1
           left[i] = Math.max(left[i-1],a[i]); //compare the array a's element with the previously stored element in 
                                           //left array and find max between them  n assign it to array left.
        }return left; //return the array left
    }
    int[] MakeRight(int[] a , int k){ //make right array to find the maximum of each element from the right side
        int right[] = new int[k];   //make right array 
        right[k-1] = a[k-1];    //asign the last element of the array to the right array
        for(int i = k-2 ; i >=0; i--){  //start traversing from the second last element of array a.
           right[i] = Math.max(right[i+1],a[i]); // compare the array a's element with the previously stored element in 
           //right array and find maximum between them n assign it to array right.
        }return right; //return the array right 
    }

    int FindSum(int[] left , int[] right, int[] a){ //method for finding the total blocks of water traped 
        for(int i=0 ; i < a.length ; i++){      
             ans = ans + Math.min(left[i] , right[i])-a[i]; //find the minimum between left[i], right[i] and then
                                   //subtract the a[i] , do these with each elemnts of array and sum up all the answers
        }return ans; //return the answer
    }
    public static void main(String[] args){
         TrapingRW rw = new TrapingRW();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of blocks to store");
        int k = sc.nextInt();
        int arr[] = new int[k]; //make the array of building blocks
        System.out.println("Enter the blocknumbers one by one");
        for(int i = 0 ; i < arr.length ; i++){
             arr[i] = sc.nextInt();
        } 
        int[] l = rw.MakeLeft(arr, k);
        int[] r = rw.MakeRight(arr, k);
        int sum = rw.FindSum(l, r, arr); //get the naswer 
        System.out.println("The amount of water trapped in the blocks is = " + sum);
    }
}
