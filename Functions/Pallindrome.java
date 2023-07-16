package Functions;
public class Pallindrome{
    static boolean pallindrome(int n){
        boolean isPallindrome = false;
        int rev=0;
        for(int i=n;i>0;i/=10){
            int lastDigit=i%10;
            rev =rev *10 +lastDigit;
        }
        if(rev==n){
            isPallindrome=true;
        }
        return isPallindrome;
    }
    public static void main(String[] args) {
        System.out.println(pallindrome(11));
    }
}