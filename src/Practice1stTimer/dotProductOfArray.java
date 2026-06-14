package Practice1stTimer;

import java.util.Scanner;

public class dotProductOfArray {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                System.out.println("Enter for A= ");
                A[i][j]=sc.nextInt();
                System.out.println("Enter for B= ");
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(A[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0; j<3; j++){
                sum+=(A[i][j])*(B[j][i]);
            }
            System.out.println(sum);
        }
    }
}
