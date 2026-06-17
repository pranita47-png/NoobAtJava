package methodPractice;

import java.util.Scanner;

public class MethodPrac7 {

    static int GCD(int dvr,int dvd ){
        int rem;
        do{
            rem=dvd%dvr;
            dvd=dvr;
            dvr=rem;
        } while( rem>0 );
        return dvd;
    }

    public static void main(String[] arr){
        //GCD my way
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value- ");
        int num1=sc.nextInt();
        System.out.println("enter the value- ");
        int num2=sc.nextInt();
        int n = GCD(num1, num2);
        System.out.println(n);
    }
}
