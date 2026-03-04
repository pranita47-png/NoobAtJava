import java.util.Scanner;
public class Palindrome {
    public static void main(String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("====Palindrome or not=====");
        System.out.println("Enter the number- ");
        int num,digit,rev=0,check;
        num =sc.nextInt();
        check=num;
        while(num>0){
            digit=num%10;
            num=num/10;
            rev=rev*10+digit;
        }
        if(rev==check) System.out.printf("Yes %d is a Palindrome",check);
        else System.out.printf("No %d is NOT a Palindrome",check);
    }
}
