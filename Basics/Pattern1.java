package Basics;


public class Pattern1{
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        // *
        // **
        // ***
        // ****

            for(int line=0; line<n;line++){
                for(int star=0; star<=line; star++){
                    System.out.print("*");
                }
                System.out.println();
            }

        // 1
        // 12
        // 123
        // 1234

            for(int line=0; line<n; line++){
                for(int start=0;start<=line; start++){
                    System.out.print(start+1);
                }
                System.out.println();
            }

        // ****
        // ***
        // **
        // *

            for(int line=0; line<4; line++){
                for(int star=1; star<(n-line+1);star++){
                    System.out.print("*");
                }
                System.out.println();
            }

        // A
        // BC
        // EFG
        // HIJK

            for(int line=0; line<n;line++){
                for(int j=0;j<=line;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }

    }
}
