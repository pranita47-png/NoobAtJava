import java.util.Scanner;
public class WebType {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the domain name- ");
        String str1 = sc.nextLine();

        String domain = str1.substring((str1.lastIndexOf(".") + 1));
        if (str1.matches("[a-zA-Z]+://([a-z]+\\.)?([a-z]+)(\\.[a-zA-Z]+)+")) //may be code is not completely user friendly but now i can say i know regex
        {
            switch (domain) {
                case "in":
                    System.out.println("india");
                    break;
                case "com":
                    System.out.println("commercial");
                    break;
                case "gov":
                    System.out.println("government");
                    break;
                case "jp":
                    System.out.println("japan");
                    break;
                case "edu":
                    System.out.println("education");
                    break;
                default:
                    System.out.print("out of my domain");
                    break;

            }
        }
        else System.out.println("Invalid Input");
    }
}
