import java.util.Scanner;
public class IncSizeOfArray {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Increase Size Of Array====");
        System.out.println("Enter the Size of Array- ");
        int size=sc.nextInt();
        int[] A=new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Enter the value at index %d- ",i);
            A[i]=sc.nextInt();
        }
        int[] B=new int[size*2];
        for(int i=0; i<size; i++){
            B[i]=A[i];
        }

        A=B;
        System.out.println();
        for(int x:A){
            System.out.print(x+",");
        }
    }
}
