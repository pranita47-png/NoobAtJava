package methodPractice;

import java.util.Scanner;

public class MethodPrac5 {
    static void IsPrime(int n){
        if (n==1||n==0) System.out.println("neither prime nor composite");
        else {int isPrime=1;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                isPrime=0;
                break;
            }
        }
        if(isPrime==1) System.out.println("prime");
        if(isPrime==0) System.out.println("not prime");
        }
    }
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter- ");
        num=sc.nextInt();
        IsPrime(num);
    }
}
