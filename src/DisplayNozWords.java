import java.util.Scanner;
public class DisplayNozWords {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int  n,digit;
        String str=""; //since tailing zero - necessary - so will have to make it a string otherwise zero will not be counted
        n=sc.nextInt();
        System.out.printf("The number %d in words is : ",n);
        str=str+n;
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            switch (c){
                case '0' : System.out.print("zero "); break;
                case '1' : System.out.print("one "); break;
                case '2' : System.out.print("two "); break;
                case '3' : System.out.print("three "); break;
                case '4' : System.out.print("four "); break;
                case '5' : System.out.print("five "); break;
                case '6' : System.out.print("six "); break;
                case '7' : System.out.print("seven "); break;
                case '8' : System.out.print("eight "); break;
                case '9' : System.out.print("nine "); break;
                case '-' : System.out.print("minus ");

            }
        }
    }
}
