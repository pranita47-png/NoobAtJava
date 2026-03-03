import java.util.Scanner;
public class SCmultiplicationTable {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whoses multiple you want- ");
        int x,i,n;
        x=sc.nextInt();
        System.out.println("Enter the number- ");
        for(i=1; i<=10; i++){
            n=i*x;
            System.out.println(x+ " x " +i + " = " +n);
        }

    }
}
