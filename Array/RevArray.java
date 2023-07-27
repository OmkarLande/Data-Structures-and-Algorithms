package Array;

import java.util.Scanner;

public class RevArray {

    public static int[] revArray(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return arr;
    }

    public static int[] input(){
        int a[]= new int [5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void print(int a[]){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = input();
        print(arr);
        int revArr[] =revArray(arr);
        print(revArr);
    }
}
