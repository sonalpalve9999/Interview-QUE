package InfytQ;
import java.util.*;
public class Exam {
    public static String convertStringToBinary(String input) {
        //String builder are used to make a mutable string with no characters in it (empty string)
        StringBuilder result = new StringBuilder();
        //input.tochararray works for splitting given string into a sequence of characters.
        char[] chars = input.toCharArray();
        //now iterate the string char by char
        for (char aChar : chars) {
            //result.apeend for separating the char and string.format for setting the 8 bit binary conversion through
            //result.tobinarystring ,as char get separate out through " ", we have to replace that by "0"
            result.append(String.format("%8s", Integer.toBinaryString(aChar)).replaceAll(" ", "0"));
        }
        return result.toString(); //got the string of binary numbers .
    }


   public static void main(String[] args){
       //user input 
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    //strore the sequence(string) of the 8 bit binary number 
    String res = convertStringToBinary(s); //o/p : 01000001010000100100001100110001001100100011001100101011
    System.out.print(res+"\n");

    //create a hashmap 
    HashMap<Integer, Character> h = new HashMap<Integer, Character>();
    //assign the key value pair
   
    String UL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    //iterate through the string  UL  and map each character with the value as 0,1,2....
    for (int m = 0  ; m < UL.length(); m++) {
        h.put(m,UL.charAt(m));
    }
    //i forgot to put this in string so you can also add + and / in the UL String
   h.put(62,'+');
   h.put(63 ,'/');

    String sub= ""; int dec; String Actualresult = ""; char v;
    //check whether string contains any other symbol rather then A-Z , a-z, 0-9,+,/.
    if((s.matches("[a-zA-Z]+")) || s.matches("[0-9]+") || (s.contains("+")) || (s.contains("/")))
   {    //now start breaking the 8 bit into 6 bit 
       for(int i = 0 ; i < res.length() ; i=i+6){
           if(i+6 < res.length()){
          sub = res.substring(i, i+6); //op will be : 010000 010100 001001 000011 001100 010011 001000 110011 001010 11
           dec = Integer.parseInt(sub,2);//converting this into decimal : 20 9 3 12 19 8 51 10
           v = h.get(dec); //finding what is the value of those decimal no. in hashmap and concatenating each respective character  
          Actualresult = Actualresult+ v; // here concat all the values op : QUJDMTIzK
      
           }if(i+6 >res.length()){ //as at last while breaking string  we get only 11 so we will append 0 to make it six 
               String o = "0";
           sub =res.substring(i);
           sub = sub.concat(o.repeat((i+6)-res.length())); //op : 010000 010100 001001 000011 001100 010011 001000 110011 001010 + (11)+(0000)
           dec = Integer.parseInt(sub,2);//now converting  this in decimal 110000 -> 48
           v = h.get(dec);    //finding what is the value of those decimal no. in hashmap and concatenating each respective character
           Actualresult = Actualresult+ v;//adding the last remained on QUJDMTIzK + (48 is w ) so final o/p QUJDMTIzKw
           }
        }
}   
else{ // if condition fails print -1
    System.out.print("-1");
}
System.out.print(Actualresult+"\n"); //final output QUJDMTIzKw

}
}
