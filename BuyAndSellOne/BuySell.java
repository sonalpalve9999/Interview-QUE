package BuyAndSellOne;
import java.util.*;
// Provide an array to you which represents the changing prices of the stock day-by-day, you need to decide a day 
//for buying the stock and also after buying  a day for selling that stock such that you will earn maximum profit 
// in it - Ex. [3,5,1,6,9,8]...so here first you will buy stock in 1 unit(i.e index position 2) and will sell that 
//stock in 9 units (i.e index positon 4) , so you will get maximum profit as  9-1 = 8 units
//(Remeber you have to buy the stock first then only you can sell it).....
//this algo takes O(n)-time complexity, O(1)-space complexity
public class BuySell {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   System.out.println("enter the size of the Array");
   int size = sc.nextInt();  //take size of array
   int[] arr= new int[size]; 
   System.out.println("Enter the values of array one by one ");
    for(int i= 0 ;  i < arr.length ; i++){ //input the array from user 
        arr[i] = sc.nextInt(); 
    }
    int minsofar = arr[0];                  //this is the day to buy the stock intialized by 0 th index position value
    int maxprofit =0;                           //this is the profit gained by sellin the profit 
    for(int i= 0 ; i < arr.length ; i++){      //start traversing the array
        minsofar = Math.min(minsofar, arr[i]); //now you are going to find the min unit so to buy the stock 
                                               //in that value
        int profit = arr[i] - minsofar;  //now everytime you find the minimum price just subtract it from
                                         //the value of array
        maxprofit = Math.max(profit, maxprofit); //and check which of the profit is greater .
                                                

    }
     System.out.println("the maximum profit you can gain in Selling the stock is " + maxprofit); //print the profit
    }
}
