import java.util.Scanner;
public class Array2D {
    public static void main(String[] arr){
        int [][]A=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                System.out.printf("Enter value of array for row %d and coulumn %d =",i,j);
                A[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int[] x:A){
            for(int y:x){
                System.out.println(y);
            }
            System.out.print(" ");
        }
    }
}
