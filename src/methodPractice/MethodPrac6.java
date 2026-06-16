package methodPractice;

import java.util.Scanner;

public class MethodPrac6 {
    static boolean IsPrime(int n){
        if( n==1 || n==0) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter- ");
        int num=sc.nextInt();
        System.out.println(IsPrime(num));
    }
}
