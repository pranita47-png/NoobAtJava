package methodPractice;

public class MethodPrac4 {
    static void intro(String n){
        System.out.println("My name is "+n); //copying ref in case of object (parameter passing in java)
    }
    public static void main(String[] arr){
        String name="Prasida";
        intro(name);
    }
}
