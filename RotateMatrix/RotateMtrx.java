package RotateMatrix;
import java.util.*;

//Provided one matrix or say. 2-D array , so we have to rotate it by 90 degree in clockwise direction and
//print the rotated matrix....so this can be done in O(n^2)-time complexity and O(1) - space Complexity
//EX. |1 2 3|  will become -->  |7 4 1 |
//    |4 5 6|                   |8 5 2 |
//    |7 8 9|                   |9 6 3 |
// 

public class RotateMtrx {  
    public void PrintArray(int[][] k){
        for(int i= 0 ;  i < k.length ; i++){ //print 2D- array  i.e Matrix
            for(int j = 0 ; j < k.length ; j++){
                System.out.print(k[i][j] + " ");
            }System.out.println("");
        }
    }
  public static void main(String[] args){
    RotateMtrx R = new RotateMtrx();
    Scanner sc = new Scanner(System.in);
   System.out.println("enter the  size of the Array");
   int m = sc.nextInt(); //input the size of array assume its of row .
int n =m;  //same size will be alloted to the column

   int[][] arr= new int[m][n]; //make matrix
   
   System.out.println("Enter the values of array one by one");
    for(int i= 0 ;  i < m ; i++){ //input the matrix element
        for(int j = 0 ; j < n ; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Here is your given array");
    R.PrintArray(arr);

System.out.println("Here is the Matrix after Rotating ");
int temp = 0;
  for(int i = 0 ; i < m ; i ++){  // Make Transpose of a  matrix 
      for(int j = i+1 ; j < n ; j++){ //i.e row will become column and column will become row.
             //swap the values of row and column , and here the diagonal element s will never change 
              temp = arr[i][j];         //Tranpose looks like -->|1 4 7 |
               arr[i][j] = arr[j][i];    //                      |2 5 8 |
               arr[j][i] = temp;        //                       |3 6 9 |
        }
  }
   int k =0 ;
for(int i =0 ; i < m ; i ++){  //After transposing reverse the elements present in one row , 
      int low = 0, high = n - 1;  
      while(low < high){
          //swap the elements .      //after reversing the result would be ---->
      k = arr[i][low];                   //    |7 4 1 |
      arr[i][low] = arr[i][high];        //    |8 5 2 |
      arr[i][high] = k;                  //    |9 6 3 |
      low++;
      high--;
      }         
  }
  R.PrintArray(arr); //print the result 
  
    }
    
}
