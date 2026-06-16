package methodPractice;

public class MethodPrac3 {
    void increase(int[] X, int index, int value){
        X[index]=value;
    }

    static void change(int a){
        a+=a;
    }

    public static void main(String[] arr){
        int[] A={2,3,4,5,6};
        MethodPrac3 inc=new MethodPrac3();
        inc.increase(A,2,20);  //A and X ref to the same array
        for (int x:A){
        System.out.println(x);
        }
        int y=10;
        change(y);  //Primitive datatype
        System.out.println(y);
    }
}
