package Practice1stTimer;
import java.util.Scanner;
public class TotalNumberOfDigits {
    public static void main(String [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter- ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("the number of digits are "+count);
    }
}
