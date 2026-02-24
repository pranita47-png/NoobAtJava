import java.util.Scanner;
public class SCStringMethod {
    public static void main(String[] arr){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your email id= ");
        String str1;
        str1= a.nextLine();
        System.out.println("your email id is "+str1.matches("[a-z0-9]+@[a-z]+\\.com"));
        System.out.println("your email is on gmail="+ str1.matches("[a-z0-9A-Z]+@gmail\\.com"));
        int i=str1.indexOf("@");
        System.out.println("your user name is "+str1.substring(0,i));
        int j=str1.indexOf("@[a-z]");
        System.out.println("your domain name is "+ str1.substring(i+1));

    }
}
