import java.lang.String;
public class Stringg {
    public static void main(String[] qq){
        char[] a={'Y', 'a', 's', 'h'};
        String str1=new String(a);
        System.out.println(str1);

        byte[] b={65, 66,67,68,69};
        String str2=new String(b,2,3);
        System.out.println(str2);

        //heap and pool
        String str3="Pronite";
        String str4="Pronite";
        String str5=new String("Pronite");

        System.out.println(str3==str4);
        System.out.println(str3==str5);
    }
}
