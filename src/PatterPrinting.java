import java.util.Scanner;

public class PatterPrinting {
    public static void main(String[] arr){
                Scanner sc=new Scanner(System.in);
                int count=1;
                System.out.println("Enter the value: ");
                int n=sc.nextInt();
                for(int i=0; i<n; i++){
                    for(int j=0; j<i; j++){
                        System.out.printf("%02d ",count);
                        count++;
                    }
                    System.out.println();
                }
                for(int k=0; k<n; k++){
                    for(int l=n-2; l>k; l--){
                        System.out.printf("%2d ",count);
                        count++;
                    }
                    System.out.println();
                }
    }
}
