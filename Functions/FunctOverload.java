package Functions;

public class FunctOverload {
    public static void sum1(int a,int b){
        System.out.println(a+b);
    }
    public static void sum2(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static float sum3(float a, float b){
        float sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        sum1(1,3);
        sum2(1, 2, 3);
        System.out.println(sum3(1f, 3.4f));        
    }
}
