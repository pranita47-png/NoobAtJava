import java.util.Scanner;
public class DateFormat {
    public static void main(String [] arr){
        System.out.println("Enter the dob in dd/mm/yyyy form- ");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(str1.matches("(([0-2][1-9])|([3][0-1]))/(([0][1-9])|([1][0-2]))/\\d{4}"));

    }
}


