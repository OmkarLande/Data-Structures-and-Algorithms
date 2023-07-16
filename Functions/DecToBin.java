package Functions;

public class DecToBin {
    static int decToBin(int n){
        int binValue=0;
        int base=1;
        for(int i=n; i>0;i/=2){
            int lastDigit=i%2;
            binValue += lastDigit*base;
            base*=10;
        }
        return binValue;
    }
    public static void main(String[] args) {
        System.out.println(decToBin(7));
    }
}
