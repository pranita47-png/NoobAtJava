package Practice1stTimer;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter- ");
        int n1=sc.nextInt();
        for(int i=2; i*i<=n1; i++ ){

                while(n1%i==0){
                    System.out.println(i);
                    n1=n1/i;

            }
        }
        if (n1 > 1) {
            System.out.println(n1);
        }
    }

}
