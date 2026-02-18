import java.util.*;
public class MyFate {
    public static void main(String arr[]) {
        float A, l, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of l: ");
        l = s.nextFloat();
        System.out.println("enter the value of b: ");
        b = s.nextFloat();
        A = (1 / 2f) * (l * b);
        System.out.println("Value of Area: "+A);
    }
}






