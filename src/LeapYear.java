import java.util.Scanner;
public class LeapYear {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the leap year- ");
        int x=sc.nextInt();
        if(x%4==0){
            if(x%100==0){
                if(x%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
