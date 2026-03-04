import java.util.Scanner;
public class DigitPlace {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====DIGIT PLACE=====");
        System.out.println("Enter the number- ");
        int n,x,i=0;
        n=sc.nextInt();
        while(n>0){
            x=n%10;
            n=n/10;
            i++;
            System.out.printf("The digit at %d's place is %d\n",i,x);
            }
        }
    }

