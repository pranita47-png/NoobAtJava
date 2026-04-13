package Practice1stTimer;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " "); // Always print the 'current' term
            b = a + b;
            a = b - a;
        }
    }
}
