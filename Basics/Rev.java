package Basics;
import java.util.*;

public class Rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        int rev = 0;
        while(digit > 0 ){
            int lastDigit = digit % 10;
            rev= (rev*10) + lastDigit;
            digit = digit/10;
        }
        System.out.println(rev);
    }
    
}
