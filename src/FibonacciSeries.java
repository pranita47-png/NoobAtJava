import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Fibonacci Series=====");
        System.out.println("Enter the value till you want the series - ");
        int n=sc.nextInt();
        int a=0,b=1;
        if(n >= 1) System.out.print(a + " "); //> was use coz if one enters 2 and u used if only for == then 0 will not get printed
        if(n >= 2) System.out.print(b + " ");
        for(int i=2;i<n;i++){
            int c=b;
             b=a+b;
             a=c;
            System.out.printf("%d ",b);
        }
    }
}
