package Array;

import java.util.Scanner;

public class PairArray {

    public static void pairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
        }
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
        pairs(a); 
    }
}
