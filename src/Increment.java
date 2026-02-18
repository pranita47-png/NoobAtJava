public class Increment {
    public static void main(String[] w){
        int x=4,y;
        x++;
        y=x++;                      //1st value of y then x ka increment
        System.out.println(x);
        System.out.println(y);
        int z;
        z=++x;                      //1st increment then value of z calculate
        System.out.println(x);
        System.out.println(z);
        int b=4;
        b++;
        b=b+1;
        System.out.println(b);
    }
}
