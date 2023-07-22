package Array;

import java.util.Scanner;

public class LargestNumber {
    
    public static int largestNum(int arr[]){
        int large=arr[0];
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
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
        int a[] = input();
        System.out.println("Largest number in array is " + largestNum(a));
    }
}
