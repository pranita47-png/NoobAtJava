package Practice1stTimer;
import java.util.Scanner;
public class InverseOfNumber {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter- ");   //if four digit anything used once anywhere  i.e. 3421 2314 1324 etc
        int n=sc.nextInt();
        int n1=n;
        int sP=1;
        int sum=0;
        while(n1>0){
            int dig=n1%10;
            sum = sum + (sP * (int)Math.pow(10, dig - 1));
            sP++;
            n1=n1/10;
        }
        System.out.printf("the value of inverse of %d is %d",n,sum);
    }
}
