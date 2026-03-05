import java.util.Scanner;
public class Nested {
    public static void main(String[] arr){
        int count=1;
        for(int i=1; i<=5;i++){ //while using nested loops always remember i is running one time and j many-time in the same line
            for(int j=i;j<i+5;j++){
                System.out.format("%02d ", count);
                count++;
            }
            System.out.println("");
        }
    }
}
