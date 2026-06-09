package Practice1stTimer;

import java.util.Scanner;

public class multiplyArray {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);

        int [][]a=new int[3][3];
        int [][]b=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("Enter value in %d and %d-",i+1,j+1);
                a[i][j]=sc.nextInt();
                System.out.printf("Enter valuein %d and %d-", i+1, j+1);
                b[i][j]=sc.nextInt();
            }
        }
            int[][] c = new int[3][3];
        for( int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j]= a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
