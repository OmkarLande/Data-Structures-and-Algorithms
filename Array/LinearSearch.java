package Array;

import java.util.Scanner;

public class LinearSearch {

    public static String linearSearch( int key, int arr[]){
        String flag ="Not available";
        for(int i=0; i<arr.length; i++){
            if(key==arr[0]){
                flag= "Found that!!!";
            }
        }
        return flag;
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
        System.out.println(linearSearch(20, a));
    }
}
