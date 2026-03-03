import java.util.Scanner;
public class SCFactorial {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Factorial=====");
        System.out.println("Enter the number- ");
        int i=1,n;
        long fact=1;
        n=sc.nextInt();
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.printf("The factorial of %d is %d ",n,fact);

    }
}
