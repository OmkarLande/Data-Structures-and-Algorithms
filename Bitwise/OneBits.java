// Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
package Bitwise;

public class OneBits {

    public static int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            System.out.println(n);
            n &= (n - 1);
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        // Use the 0b prefix to represent a binary number
        System.out.println(hammingWeight(0b10000000));
    }
}
