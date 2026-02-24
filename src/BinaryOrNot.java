import java.util.Scanner;
public class BinaryOrNot {
    public static void main(String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your binary number- ");
        String str1= sc.nextLine();
        System.out.println("your entered number is a binary number? "+ str1.matches("[0-1]+"));
    }
}
