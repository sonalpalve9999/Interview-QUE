package InfytQ;
// Input: Given a list of numbers separated with a comma. 
//The numbers 5 and 8 are present in the list. Assume that 8 always comes after 5.
// Case 1: num1 -> Add all numbers which do not lie between 5 and 8 in the Input List.
// Case 2: num2 -> Numbers formed by concatenating all numbers from 5 to 8 in the list
//Output: Sum of num1 and num2
// Example: 1,2,2,5,3,1,7,8,4
// Num1: 1+2+2+4=9
// Num2: 53178
// O/p=53178+9 = 53187
import java.util.*;
public class Number_list {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //take the input as a string for here  consider the input as : "1,2,2,5,3,1,7,8,4"
        String s = sc.nextLine();
        //covert the string into array as separable elements : [1,2,2,5,3,1,7,8,4]
        String[] elements = s.split(",");
        //covert the array into list : 1,2,2,5,3,1,7,8,4
        List<String> arr = Arrays.asList(elements);
        //note at which index position the 5 and 8 occur from the List
        int  five = arr.indexOf("5");
        int  eight = arr.indexOf("8");
        //make a substring but consider the index position of 5 and 8 from input string not from list
        String temp = s.substring(s.indexOf("5"), s.indexOf("8")+1); //o/p : 5,3,1,7,8
        //now remove the "," to get our desired case2
        temp = temp.replace(",", ""); //o/p : 53178
      
        int i = 0 ; int sum1 =0 ; int sum2 = 0;
        //now for case1 calculate sum of the elements from list before 5
     while(i!=five){
       sum1 = sum1+Integer.parseInt(arr.get(i)); //covert the string in the list into int to sum up
       i++;
     }//o/p: 1+2+2 = 5
     //now lets calculate the sum of the elements from list after 8.
     int j = arr.size()-1; //intialise by the size of list -1
     while(j != eight){
         sum2 = sum2 + Integer.parseInt(arr.get(j)); //start adding the elemnts from the end of list till the number 8
         j--;
     }//o/p = 4 coz we have only one element after 8.
     
     int ans = sum1 + sum2 + Integer.parseInt(temp); // add 5+4+ (convert string into num("53178"))
   
     System.out.print(ans); //o/p will be 5+4+53178 = 53187
   }       
}

