package Functions;

import java.util.*;
public class Prime {
    //normal way
    // public static boolean isPrime(int a){
    //     boolean primeOrNot = true;
    //     for(int i=2 ; i<a; i++){
    //         if(a%i==0){
    //         primeOrNot= false;
    //         }
    //     }
    //     return primeOrNot;
    // }


    // optimized way
    public static boolean isPrime(int a){
        boolean primeOrNot= true;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
            primeOrNot= false;
            }
        }
        return  primeOrNot;
    }


    //prime in range
    public static void primeInRange(int n){
         int count=0;
        for(int i=2;i<=n;i++){
            count =0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
                
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        primeInRange(5);
    }
}
