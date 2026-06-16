package methodPractice;

public class MethodPrac1 {
    static int max(int x, int y){
        x+=x;
        if(x>y) return x;
        else return y;
    }
    public static void main(String[] arr){
        int a=10, b=14, c;
        c=max(a,b);
        System.out.println(c);
        System.out.println(a);

    }
}
