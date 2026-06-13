package Practice1stTimer;

import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];
        //int[][] B=new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++){
            System.out.println("Enter");
            A[i][j]=sc.nextInt();
        }
        }
        for(int j=0; j<3; j++){
            int sum=0;
            for(int i=0; i<3; i++){

                sum=sum+A[i][j];

            }
            System.out.println(sum);
        }

    }
}
