import java.util.Scanner;
public class RemovingExtraSpaces {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string- ");
        String str1=sc.nextLine();
        System.out.println("the string without extra spaces is "+str1.replaceAll( "\\s+"," "));

    }
}
