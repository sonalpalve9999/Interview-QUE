package TCS;
import java.util.*;

public class Prime {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int prime_count = 0 ;
        int trial = 0;
        int n = sc.nextInt();
        sc.close();
        int temp = n ;
        while(temp != 1){
        for(int i = 2 ;  i <= n ; i++){
            boolean isPrime = true;
            for (int j=2; j <= i/2; j++)
            {
                if ( i % j == 0)
                {
                    isPrime = false;
                    break;
                }

        }
        if ( isPrime == true ){
             prime_count = prime_count +1;
        }

    }
    temp = n - prime_count;
    trial = trial + 1;
}
System.out.println(trial);

}
}
