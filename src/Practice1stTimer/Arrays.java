package Practice1stTimer;

import java.util.Scanner;

public class Arrays{
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        //int [][]A = new int[3][3];
        int [][]A = new int[][] {{2,3,4},{4,5,3},{3,4,6}};
        int [][]B=new int[][] {{4,3,2},{1,3,4},{3,3,2}};
        int [][]C=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}