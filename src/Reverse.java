import java.util.Scanner;
public class Reverse {
    public static void main(String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Reverse a Number====");
        System.out.println("Enter the number- ");
        int x,n,r=0;
        n=sc.nextInt();
        while(n>0){
            x=n%10;
            n=n/10;
            r=r*10+x;
        }
        System.out.printf("Reverse of the number is %d", r);

    }
}
