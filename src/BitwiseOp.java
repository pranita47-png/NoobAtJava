import java.util.Scanner;
public class BitwiseOp {
    public static void main(String[] w){
        Scanner c=new Scanner(System.in);
        int x=0b0010;

        int y=x>>1;
        int z=x<<2;
        System.out.println(z);

//        System.out.println(String.format("%s",Integer.toBinaryString(x)));
//        System.out.println(String.format("%s",Integer.toBinaryString(y)));

    }
}
