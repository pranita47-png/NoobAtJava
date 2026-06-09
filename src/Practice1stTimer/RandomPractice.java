package Practice1stTimer;

import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        //Prime factorization
        System.out.println("Enter the number- ");
        int num=sc.nextInt();
        int num1=num;
        for(int i=2; i*i<=num; i++) {
            while(num1%i==0){
                System.out.println(i);
                num1=num1/i;
            }
        }
    }
}