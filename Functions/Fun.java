package Functions;

public class Fun {
    public static int multiply(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static int factorial(int n){
        int fact =1;
        for(int i =1; i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static float nCr(int n , int r){
        int factN= factorial(n);
        int factR= factorial(r);
        int factNmR = factorial(n-r);
        float nCr=factN/(factR*factNmR);
        return nCr;
    }
    public static void main(String[] args) {
        System.out.println("factorial :"+factorial(11));
        System.out.println("Multiply:"+ multiply(1, 2));
        System.out.println("nCr:"+nCr(12, 1));
    }
}
