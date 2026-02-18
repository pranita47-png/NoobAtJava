import java.util.Scanner;
public class SwappingBit {
    public static void main(String[] w){
        Scanner s=new Scanner(System.in);  //swap
        int a,b;
        System.out.print("enter the value of a=");
        a=s.nextInt();
        System.out.print("enter the value of b=");
        b=s.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        //System.out.printf("%s%n",Integer.toBinaryString(a));
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%s",Integer.toBinaryString(b)));

    }
}
