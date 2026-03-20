import java.util.Scanner;
public class CopyingArray {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("====Copying Array====");
        System.out.println("Enter the index for your array- ");
        int size=sc.nextInt();
        int[] A=new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Enter the size of your array %d - ",i);
            A[i]=sc.nextInt();
        }
        System.out.println("Original Array- ");
        System.out.print("[");
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.print("]");
        int[] B=new int[size];
        for(int i=0; i<size; i++){
            B[i]=A[i];
        }
        System.out.println();
        System.out.println("Copied Array -");
        System.out.print("[");
        for(int x:B){
            System.out.print(x+",");
        }
        System.out.print("]");
    }
}
