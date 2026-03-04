import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=======ArmStrong Number======");
        System.out.println("Enter the number- ");
        int x,n,m;
        n=sc.nextInt();
        double y=0;
        m=n;
        String s=Integer.toString(n);
        int l=s.length();
        while(n>0){
            x=n%10;
            n=n/10;
            y=y+(Math.pow(x,l));
        }
        if(y==m){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }

}
