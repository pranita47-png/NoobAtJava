import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number- ");
        int n=sc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n ; j++){

                System.out.printf(" %02d ",count);
                count++;
            }
            System.out.println();
        }
    }
}

