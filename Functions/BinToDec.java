package Functions;

public class BinToDec {
    static int binToDec(int n){
        int decValue= 0;
        int base=1;
        for(int i= n;i>0;i/=10){
            int lastDigit = i%10;
            decValue += lastDigit*base;
            base*=2;
        }
        return decValue;
    }
    public static void main(String[] args) {
        System.out.println(binToDec(111));    
    }
}
