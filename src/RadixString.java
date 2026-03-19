import java.util.Scanner;
public class RadixString {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number- ");
        String str1=sc.nextLine();
        if(str1.matches("[01]+")){
            System.out.println("Binary Number");
        }
        else if(str1.matches("[0-7]+")){
            System.out.println("Octal Number");
        }
        else if(str1.matches("[0-9]+")){
            System.out.println("Decimal Number");
        }
        else if(str1.matches("[0-9A-Fa-f]+")){
            System.out.println("Hexagonal Number");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
