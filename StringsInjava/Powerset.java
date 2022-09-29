package StringsInjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//you are given  a string you just need to find the power set of the string 
//ex. abc --> {"" , a,ab,bc,b,c,ac,abc} is a power set of abc it takes O(2^n) time complexity 
//recursive tree of algo
//                               abc
//                       |--------|--------|
//                       a        or       "" 
//                       |                 |
//                 ab----or-----a          b---- or----""
//                  |           |          |             |
//              abc or ab   ac or a     bc or b          c <--- powerset elements  
public class Powerset {
    void findpowerset(String s , int l , String current){
        if(l == s.length()){
            System.out.println(current);
            return;
        }
        findpowerset(s, l+1, current + s.charAt(l));
        findpowerset(s, l+1, current);
    }
    public static void main(String[] args) throws IOException{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String s = bf.readLine();
        Powerset ps = new Powerset();
        ps.findpowerset(s, 0, "");

    }
}
