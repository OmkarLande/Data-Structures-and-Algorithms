package Array;

import java.util.Scanner;

public class BinarySearch {
    
    public static boolean binarySearch(int a[], int key){
        boolean flag= false;
        int start=0;
        int end = a.length-1;
        while(start <= end){
            int mid= (start+end)/2;
            if(key==a[mid]){
                flag = true;
                break;
            }
            if(key==a[mid]){
                //right
                start=mid+1;
            }else{
                //left
                end=mid-1;
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
    int a[]= input();
    System.out.println(binarySearch(a, 2));        
    }
}
