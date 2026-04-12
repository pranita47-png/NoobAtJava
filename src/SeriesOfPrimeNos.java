import java.util.Scanner;
public class SeriesOfPrimeNos {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Prime numbers from 1-n");
        System.out.println("Enter the number- ");
        int num=sc.nextInt();
        for(int i=2; i<num; i++){
            int count=0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
