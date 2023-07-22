package Array;
import java.util.*;

public class BasicArray {
    
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
    }

    public static void main(String[] args) {
        //creation
        int arr[] =new int[5];
        int arr2[] = {1,3,4,5,};
        String arr3[] ={"og","om"};
        int a[] =input();
        print(a);
    }
}
