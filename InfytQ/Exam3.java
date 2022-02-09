package InfytQ;
import java.util.*;
public class Exam3 {
    public static ArrayList<String> permutations(String s) {
        ArrayList<String> out = new ArrayList<String>();
        if (s.length() == 1) {
            out.add(s);
            return out;
        }
        char first = s.charAt(0);
        String rest = s.substring(1);
        for (String permutation : permutations(rest)) {
            out.addAll(insertAtAllPositions(first, permutation));
        }
        return out;
    }
    public static ArrayList<String> insertAtAllPositions(char ch, String s) {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i <= s.length(); ++i) {
            String inserted = s.substring(0, i) + ch + s.substring(i);
            out.add(inserted);
        }
        return out;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] inarr1 = sc.nextLine().split(",");
        // String[] inarr2 = sc.nextLine().split(",");
        // String instr1 = sc.nextLine();
        // String instr2 = sc.nextLine();
        for(int i = 0 ;  i < inarr1.length ; i++){
            System.out.print(inarr1[i]+"\n");
        }
        String s ="";
        for(int i = 0 ;  i < inarr1.length ; i++){
            s = s.concat(inarr1[i]);
        }

        List<String> perms = permutations(s);
        for(int i = 0 ; i < perms.size() ; i++){
            System.out.println(perms.get(i));
        }
        
    } 
}
