 import java.util.Scanner;
class UrlWebPro{
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Url");
        String str=sc.nextLine();
        String web=str.substring(0,str.indexOf(":"));
        String pro=str.substring(str.lastIndexOf("."));
        //---------WEBSITE-----------
        if(web.equals("https")){
            System.out.println("It is a hypertext transfer protocol");
        }
        else if(web.equals("http")){
            System.out.println("It is a hyperText transfer protocol secure");
        }
        else if(web.equals("ftp")){
            System.out.println("It is file transfer protocolh");
        }
        else{
            System.out.println("kuch or daal");
        }
        //---------Protocol----------
        if(pro.equals(".com")){
            System.out.println("commercial");
        }
        else if(pro.equals(".in")){
            System.out.println("india");
        }
        else if(pro.equals(".biz")){
            System.out.println("business");
        }
        else{
            System.out.println("nahi pata");
        }

    }
 }