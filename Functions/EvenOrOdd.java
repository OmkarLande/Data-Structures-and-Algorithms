package Functions;

public class EvenOrOdd {
    static boolean evenOrOdd(int n){
        boolean isEven=false;
        if(n%2==0){
            isEven=true;
        }
        return isEven;
    }
    public static void main(String[] args) {
        System.out.println(evenOrOdd(2));
    }
}
