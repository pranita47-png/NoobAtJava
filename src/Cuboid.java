import java.util.Scanner;
public class Cuboid {
    public static void main(String[] w){
         Scanner c = new Scanner(System.in);
         float T,l,b,h,V;
         System.out.println("enter the length: ");
         l=c.nextFloat();
         System.out.println("enter the breadth: ");
         b=c.nextFloat();
         System.out.println("enter the height: ");
         h=c.nextFloat();
         T=2f*((l*b)+(b*h)+(h*l));
         System.out.println("the value of total surface area = "+T);
         V=l*b*h;
         System.out.println("the value of volume= "+V);


    }
}
