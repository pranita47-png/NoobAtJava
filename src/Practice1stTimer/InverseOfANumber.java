package Practice1stTimer;
import java.util.Scanner;
public class InverseOfANumber {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n, n2=n;
        int count=0;
        while(n1>0){
            n1=n1/10;
            count++;
        }
        int sum=0;
        for(int i=1; i<=count; i++){
            int n21=n2%10;
            System.out.printf("value at %d place is %d\n",i,n21);
            n2=n2/10;
            sum=sum+i*((int)Math.pow(10,(n21-1)));
        }
        System.out.println(sum);
    }
}
