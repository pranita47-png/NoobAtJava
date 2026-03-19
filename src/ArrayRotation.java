import java.util.Scanner;
public class ArrayRotation {
    public static void main(String []arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of index - ");
        int index=sc.nextInt();
        int[] A=new int[index];
        for(int i=0; i<A.length; i++){
        System.out.printf("Enter the value of %d index- ",i);
        A[i]=sc.nextInt();
        }
        for(int x:A){
            System.out.print(x+", ");
        }
        int temp=A[0];
        for(int j=1; j<A.length; j++ ){
            A[j-1]=A[j];
        }
        A[A.length-1]=temp;
        System.out.println();
        for(int x:A){
            System.out.print(x+", ");
        }

    }

}
