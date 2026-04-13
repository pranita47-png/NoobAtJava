package Practice1stTimer;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter- ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int c=num%10;
            rev=rev*10+c;
            num=num/10;
           // System.out.print(c);
        }
        System.out.println();
        while(rev>0){
            int ch=rev%10;
            rev=rev/10;
            System.out.println(ch);
        }
    }
}
