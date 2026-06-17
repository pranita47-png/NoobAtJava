package methodPractice;

import java.util.Scanner;

public class MethodPrac8 {
    static int GCD(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;

            else b=b-a;
        }
        return a;
    }
    public static void main(String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value- ");
        int num1=sc.nextInt();
        System.out.println("enter the value- ");
        int num2=sc.nextInt();
        int n = GCD(num1, num2);
        System.out.println(n);
    }
}
