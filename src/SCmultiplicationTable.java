import java.util.Scanner;
public class SCmultiplicationTable {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whoses multiple you want- ");
        int x,i,j;
        x=sc.nextInt();
        System.out.println("Enter the number till which you want the multiple- ");
        j=sc.nextInt();
        for(i=1; i<=j; i++){
            System.out.println(x+ " x " +i + " = " +(x*i));
        }

    }
}
