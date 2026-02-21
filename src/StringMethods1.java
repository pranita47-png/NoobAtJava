public class StringMethods1 {
    public static void main(String[] arr) {
        String str = "  Well Comee";
        //1.length
        int l = str.length();
        System.out.println("length of the string = " + l);
        //2. lower and upper case Also string is immutable
        String str1= str.toLowerCase();  //created inside heap
        System.out.println(str1);
        String str2= str.toUpperCase();
        System.out.println(str2);
        //3. trim
        String str3= str.trim();
        System.out.println(str3);
        //4.substring(start, endindex)
        String str4= str.substring(3);
        System.out.println(str4);
        String str5= str.substring(4,11); //l is on 4th index and e on 11th and upto (end index-1) it gets printed
        System.out.println(str5);
        //5.replace
        String str6= str.replace('e','y');
        System.out.println(str6);
    }
}
