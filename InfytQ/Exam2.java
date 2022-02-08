package InfytQ;
import java.util.*;
public class Exam2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();  
        for(int i= a ; i >= 0 ; i++){
         list.add(a%10);
         a = a/10;
        }
        List<Integer> ls=new ArrayList<Integer>(); 
        List<Integer> res=new ArrayList<Integer>(); 
        String temp;
        int t;
        int count = 1 ;  int maxcount = 0;
        for(int i = 0 ;  i < list.size() ; i++){
            temp = Integer.toString(list.get(i)) + Integer.toString(list.get(i+1));
             t = Integer.parseInt(temp);
             ls.add(t);
            }
        for(int i = 0  ; i < ls.size() ; i++){
            for(int j = 0 ;  j < list.size() ; j++){
                if((ls.get(i)%list.get(j) == 0)){
                   count =count + 1;
                   res.add(i);
                }       
        }int g = ls.get(i);
       if(ls.get(i) != g  && g%ls.get(i) == 0){
           
       }
}
    }
}


