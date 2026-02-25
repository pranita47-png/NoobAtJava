import java.util.Scanner;
public class ToFindNoOfWords {
    public static void main (String [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the string- ");
        String str1=sc.nextLine();
        String str2=str1.replaceAll("\\s+", " ").trim();
        String words[]= str2.split("\\s");
        System.out.println("The no of words-" + words.length);
    }
}
