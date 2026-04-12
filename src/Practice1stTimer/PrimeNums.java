package Practice1stTimer;
import java.util.Scanner;
public class PrimeNums {
    public static void main(String[] arr){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the prime number- ");
       int num=sc.nextInt();
       for(int k=2; k<=num; k++) {
           int count = 0;
           for (int i = 2; i <= Math.sqrt(k); i++) {
               if (k % i == 0) {
                   count++;
                   break;
               }
           }
           if (count==0) {
               System.out.println(k);
           }
       }
    }
}
