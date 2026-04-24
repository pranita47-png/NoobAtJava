package Practice1stTimer;

import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers- ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=n1;
        int b=n2;
        while(a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }
        int gcd=b;
        int lcm=(n1/gcd)*n2;
        System.out.println("GCD= "+gcd);
        System.out.println("LCM= "+lcm);
    }
}
