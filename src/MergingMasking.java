public class MergingMasking {
    public static void main(String[] srr){
       byte a=4;
       byte b=6;
       byte c;
       //c=a;
       //c= (byte)(c<<4);
        c=(byte)(a<<4);
       c=(byte)(c|b);
       System.out.println("c= "+c);
       System.out.println(String.format("%s",Integer.toBinaryString(c)));

       System.out.println((c&0b11110000)>>4);
       System.out.println((c&0b00001111)); // writing 00001111 java thinks it as hexdecimal no and result is diff


    }
}
