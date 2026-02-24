import java.util.Scanner;
public class HexDecimalOrNot {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hexadecimal number- ");
        String str1=sc.nextLine();
        System.out.println("your entered value is a Hexadecimal number? "+(str1.matches("[A-Fa-f0-9]+")));

    }
}
