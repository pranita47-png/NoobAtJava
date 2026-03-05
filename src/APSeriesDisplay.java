import java.util.Scanner;
public class APSeriesDisplay {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        System.out.println("=====AP Series=====");
        System.out.println("Enter the value of first number i.e. 'a' : ");
        a=sc.nextInt();
        System.out.println("Enter the value of difference of number i.e. 'd' : ");
        d=sc.nextInt();
        System.out.println("Enter the numbers till you want to get value i.e. 'n' : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int an=a+(i)*d;
            System.out.printf("%d ",an);
            //a=a+d;//System.out.printf(" %d ",a);//i++;
        }
    }
}
