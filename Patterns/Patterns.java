package Patterns;

public class Patterns {
    
    public static void hollowRectangle(int cols, int rows){
        //outer loop
        for(int i=1; i<=rows ;i++){
            //inner loop
            for(int j=1; j<=cols; j++){
                if(i == 1|| i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int rows, int cols){
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
                for(int k=1; k<=rows-i; k++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i;k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void floydsTriangle(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void binaryTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void butterfly(int n){
        for(int i=1; i<=n;i++){
           
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k=1;k<=(2*(n-i));k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
        for(int i=n; i>=1;i--){
           
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k=1;k<=(2*(n-i));k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(3 , 5);
        invertedHalfPyramid(4, 4);
        invertedHalfPyramidWithNumbers(5);
        floydsTriangle(5);
        binaryTriangle(5);
        butterfly(10);
    }
}
