package Array;

import java.util.Scanner;

public class SubArray {
    public static void subArray(int a[])
    {   int sum=0;
        for(int i=0; i<a.length; i++){
            int start=i;
            for(int j=i; j<a.length; j++){
                int end=j;
                for(int k=start; k<end; k++){

                    System.out.print(a[k]+" ");
                }
                sum ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sum = "+sum);

    }

    public static void maxSubArray(int a[])
    {   int currentSum =0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            int start=i;
            for(int j=i; j<a.length; j++){
                int end=j;
                currentSum=0;
                for(int k=start; k<end; k++){
                    currentSum +=a[k];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxSum);

    }

    public static void maxSubArray2(int a[])
    {   int currentSum =0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[] = new int[a.length];

        prefix[0] = a[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + a[i];
        }
        for(int i=0; i<a.length; i++){
            int start=i;
            for(int j=i; j<a.length; j++){
                int end=j;
                currentSum= start==0? prefix[end] : prefix[end] - prefix[start -1];
               
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum (2)= "+maxSum);
    }

    //kadan`s algo is nothing but -ve no. is considered to be zero.
    //ye fatega agar given mein sab negetive no. hoaga  zero ans. ayega
    // fir iss case mein ek loop lagao jisase check ho agar sab no. -ve hai ya nhi 
    // aur smallest no. print karva dena....
    public static void kadansAlgo(int a[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for( int i=0; i<a.length; i++){
            currentSum += a[i];
            if(currentSum < 0){
                currentSum =0;
            }
            maxSum= Math.max(currentSum, maxSum);
        }
        System.out.println(" Maximum sum (by kadan`s algo) = " + maxSum);
    }

    public static int[] input(){
        int a[]= new int [5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]=input();
        subArray(a);
        maxSubArray(a);
        maxSubArray2(a);
        kadansAlgo(a);
    }

}
