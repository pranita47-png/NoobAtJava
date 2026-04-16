package Practice1stTimer;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter-");
        int num=sc.nextInt();
        int num1=num;
        int rev=0;
        while(num1>0){
            int div=num1%10;
            rev=rev*10+div;
            num1=num1/10;
            //System.out.print(div);
        }
        if(rev==num){
            System.out.println("yes it's a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
