import java.util.Scanner;
class Reverse {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Reverse=====");
        System.out.println("Enter the number- ");
        int n,d,N,r=0;
        n=sc.nextInt();
        N=n;
        while(N>0){
            d=N%10;
            N=N/10;
            r=r*10+d;
        }
        System.out.println(r);
        }
    }

