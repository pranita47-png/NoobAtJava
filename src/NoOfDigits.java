import java.util.Scanner;
public class NoOfDigits {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====No Of Digits=====");
        System.out.println("Enter the number- ");
        int n,x,i=0;
        n=sc.nextInt();
        x=n;
        while(n>0){
            n=n/10;
            i++;
        }
        System.out.printf("Their are %d digits in %d",i,x);

    }
}