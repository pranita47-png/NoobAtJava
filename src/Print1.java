public class Print1 {
    public static void main(String[] arr){
        //conversion
        float x=2.334f;
        float y=5526.6744f;
        System.out.printf("%f %f\n",x,y);
        System.out.printf("%g %g\n",x,y);

        //arrgment index  .precision
        int a=343;
        System.out.printf("%2$f %1$d\n",a,x);
        System.out.printf("p=%06.2f\n",x);
        System.out.printf("y=%03.2f",y);

        //flag width
        int w=78;
        int h=-98;
        System.out.printf("\nr= %5d\n",w);
        String str="Java";
        System.out.printf("%12s\n",str);
        System.out.printf("%-12s",str);
        System.out.printf("%(d\n",h);
        System.out.format("%07d\n",h);
        System.out.printf("%+d\n",h);
        System.out.printf("% d",w);
    }
}
