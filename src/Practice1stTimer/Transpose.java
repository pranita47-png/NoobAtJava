package Practice1stTimer;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int [][]A=new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter- ");
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Transpose");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(A[j][i]+ " ");
            }
            System.out.println();
        }



    }
}
