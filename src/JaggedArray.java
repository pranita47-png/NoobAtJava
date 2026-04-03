import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[4][];
       for(int i=0; i<4; i++){
           System.out.printf("Enter the size for A[%d][] array- ",i);
           int n=sc.nextInt();
           A[i]=new int[n];
       }
        for(int[] x:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
