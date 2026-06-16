package methodPractice;

public class MethodPrac2 {
    int max(int x, int y){
        if(x>y) return x;
        else return y;
    }
    public static void main(String[] arr){
        int a=10,b=2,c;
        MethodPrac2 m=new MethodPrac2();
        c=m.max(a,b);
        System.out.println(c);
    }
}
