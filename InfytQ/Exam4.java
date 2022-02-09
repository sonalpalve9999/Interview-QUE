package InfytQ;
import java.util.*;
public class Exam4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] inarr = sc.nextLine().split(",");
        String instr = sc.nextLine();
        String[] res = sc.nextLine().split(",");
        for(int i = 0 ;  i < inarr.length ; i++){
            int k = inarr[i].length();
            for(int j = 0 ;  j < k ; j++){
              if(instr.contains(inarr[i].substring(j,j))){
                res[i] = res[i] + inarr[i].charAt(j);
              }else{
                  res[i] = "-1";
              }
            }
        }
        for(int i = 0 ;  i < res.length ; i++){
            if(res[i] != "-1"){
                System.out.print(res[i]+",");
            }
            
        }
    }
}
