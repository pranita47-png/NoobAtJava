package Practice1stTimer;

import java.util.Scanner;

public class sumOfSecDiagonal {
    public  static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter");
                A[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0; i<3; i++){
                sum+=A[i][2-i];
        }
        System.out.println(sum);
    }
}
