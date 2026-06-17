package methodPractice;

public class MethodPrac9 {
    static int max(int[] X){
        int m=X[0];
        for(int i=0; i<X.length; i++){
            if(X[i]>m) m=X[i];
        }
        return m;

    }
    public static void main(String[] arr){
        int[] A={2,4,5,6,7,1};
        System.out.println(max(A));
    }
}
