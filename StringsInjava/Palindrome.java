package StringsInjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// given a string in input you just have to figure out whether it is a plaindrome or not 
//a string is said to be palindrome , if after reversing the respective string you get the same string 
//ex. abcba after reversing it you get ---> abcba which is same, so it is a plaindrome.
public class Palindrome {
     Boolean ispalindrome(String s , int l , int r){
        if(l>= r){
            return true;
        }else if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return ispalindrome(s,l+1,r-1);
      }
         
     
    public static void main(String[] args) throws IOException{
        Palindrome p = new Palindrome();
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String s = bf.readLine();
        if(p.ispalindrome(s, 0, s.length()-1) == true){
            System.out.println("it is a Palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }

        
}
}
