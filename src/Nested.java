import java.util.Scanner;
public class Nested {
    public static void main(String[] arr){
        for(int i=1; i<=5;i++){ //while using nested loops always remember i is running one time and j many-time in the same line
            for (int k=i; k>=4-i; k--){
                System.out.print(" ");
            }
            for(int j=5-i+1;j>0;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
