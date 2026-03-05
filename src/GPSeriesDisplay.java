import java.util.Scanner;
import static java.lang.Math.pow;
public class GPSeriesDisplay {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Geometric Progression=====");
        System.out.println("Enter the value of 'a' : ");
        int a,r,k,i;
        a=sc.nextInt();
        System.out.println("Enter the value of 'r' : ");
        r=sc.nextInt();
        System.out.println("Enter the value of 'k' : ");
        k=sc.nextInt();
        for(i=0;i<k;i++){
            double an= a*pow(r,i);
            System.out.printf("%.2f ",an);
        }

    }
}
