import java.util.Scanner;

public class Triangle {
    public static void main(String w[]){
        Scanner s=new Scanner(System.in);
        double A,S,a,b,c;
        System.out.println("enter the value of 1st side= ");
        a=s.nextDouble();
        System.out.println("enter the value of 2nd side= ");
        b=s.nextDouble();
        System.out.println("enter the value of 3rd side= ");
        c=s.nextDouble();
        S=(a+b+c)/2;
        if (a + b > c && a + c > b && b + c > a) {
            A = Math.sqrt(S * (S - a) * (S - b) * (S - c));
            System.out.println("Area of triangle = " + A);
        } else {
            System.out.println("Invalid triangle");
        }

    }
}
