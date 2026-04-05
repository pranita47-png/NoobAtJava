import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number- ");
         int n=sc.nextInt();
        if(n <= 1){
            System.out.println("not prime");
            return;
        }
         int isPrime=1;
         for(int i=2; i<n; i++){
             if (n%i==0) {isPrime=0; break;}
         }
         if(isPrime==1) System.out.println("yes Prime");
         else System.out.println("not prime");
    }
}
