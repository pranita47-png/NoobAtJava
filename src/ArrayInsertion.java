import java.util.Scanner;
public class ArrayInsertion {
        public static void main(String []arr){
            int[] A = new int[7];
            A[0] = 3;
            A[1] = 4;
            A[2] = 5;
            A[3] = 7;
            A[4] = 2;
            for(int i=1; i<4; i++){
                A[i]=A[i+1];
            }
            for(int i=0; i<4; i++){
                System.out.println(A[i]);
            }


        }
}


