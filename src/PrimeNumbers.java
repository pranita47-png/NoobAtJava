import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value- ");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<2) {
            System.out.println("invalid, prime starts from 2");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
           if(n%i==0) {
               isPrime=false;
               break;
           }
        }
        if(isPrime) System.out.println("yes its prime");
        else System.out.println("no not prime");
    }
}
