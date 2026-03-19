import java.util.Scanner;
public class Array2ndLargest {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of index for array- ");
        int n=sc.nextInt();
        int []A=new int[n];
        for(int j=0; j<A.length; j++){
        System.out.printf("Enter the value of array at index %d - ",j);
        A[j]=sc.nextInt();
        }
        int max2=A[0];
        int max1=A[0];
        for(int i=0;i<A.length;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            }
            else if (max2<A[i]&&A[i]!=max1){
                max2=A[i];
            }
            }
        System.out.println("The maximum number is "+max1);
        System.out.println("The 2nd largest number is "+max2);
        }
    }

