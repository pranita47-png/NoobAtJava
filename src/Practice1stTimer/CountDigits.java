package Practice1stTimer;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter- ");
        int orgNum = sc.nextInt();
        int num = Math.abs(orgNum);
        if (num == 0) {
            System.out.println(0);
        }
        else {
            if (orgNum < 0) {
                System.out.println("-");
            }

            int num1 = num;
            int count = 0;
            while (num1 > 0) {
                num1 = num1 / 10;
                count++;
            }
            int div = (int) Math.pow(10, count - 1);
            int num2;
            while (div > 0) {
                num2 = num / div;
                num = num % div;
                div = div / 10;
                System.out.println(num2);
            }
        }
    }
}
