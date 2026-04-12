import java.util.Scanner;
public class SeriesOfPrimes {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Prime numbers=====");
        System.out.println("Enter the number- ");
        int num=sc.nextInt();
        if(num<2){
            System.out.println("enter another number");
            return;
        }
        boolean flag=true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("yes its prime");
            else System.out.println("no its not prime ");
    }
}
