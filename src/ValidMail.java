import java.util.Scanner;
public class ValidMail {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you email id= ");
        String str1= sc.nextLine();

        System.out.println("you emain id is "+str1.matches("[a-z0-9]+@[a-z]+//.[a-z]+"));

        int l=str1.indexOf("@");
        String username= str1.substring(0,l);
        System.out.println("username- "+username);


        String domain= str1.substring((l+1));
        System.out.println("domain- "+domain);

        int k=domain.indexOf(".");
        String name=domain.substring(0,k);
        System.out.println(name.equals("gmail"));
    }
}
