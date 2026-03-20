import java.util.Scanner;
public class DeletionArray {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Array Deletion====");
        System.out.println("Enter the length of your Array- ");
        int size=sc.nextInt();
        int A[]=new int[size];
        for(int i=0; i<size ; i++) {
            System.out.printf("Enter the value for index %d - ", i);
            A[i] = sc.nextInt();
        }

        System.out.println("Enter from which index you want to delete the value- ");
            int del=sc.nextInt();

        if(del < 0 || del >= size){
            System.out.println("Invalid index");
            return;
        }

        for(int i=del+1; i<size; i++){
            A[i-1]=A[i];
        }
        size--;
        for(int i=0; i<size; i++){
            System.out.print(A[i]+", ");
        }
    }
}

