import java.util.Scanner;
 class QuadriticEq {
    public static void main(String[] arr){
        int a,b,c;
        double x,y;
        Scanner q=new Scanner(System.in);
        System.out.println("Enter the value of a= ");
        a=q.nextInt();
        System.out.println("Enter the value of b= ");
        b=q.nextInt();
        System.out.println("Enter the value of c= ");
        c=q.nextInt();
        x= (-b+(Math.sqrt((b*b)-(4*a*c))))/2;
        y= (-b-(Math.sqrt((b*b)-(4*a*c))))/2;
        System.out.println("the value of x= " +x);
        System.out.println("the value of 2nd root is "+y);
    }
}
