import java.util.Scanner;
public class OddEven {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter the number- ");
        x= sc.nextInt();
        if(x%2==0){
            System.out.println("yes it is an Even number");
        }
        else{
            System.out.println("no it is odd");
        }
    }
}
