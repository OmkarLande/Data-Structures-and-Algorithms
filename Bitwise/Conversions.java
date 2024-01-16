package Bitwise;

class Converter {

    // Here - computer knows the binary form of all numbers
    // so we just use binary operators

    public String toBinary(int decimal) {
        String result = "";
        while (decimal != 0) {
            // we use "& 1" which seperate the last bit from number
            int lastBit = decimal & 1;
            // add last bit to result
            result = lastBit + result;
            // right shift to whole number
            decimal = decimal >> 1;
        }

        return result;
    }

    public int toDecimal(int binary) {
        int result = 0;
        int index = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            if (lastDigit == 1) {
                result += (int)Math.pow(2, index);
            }
            index++;
            binary /= 10;
        }

        return result;
    }

}

public class Conversions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a decimal Number");
        // int number = sc.nextInt();
        // String result = "";

        // while (number > 0) {
        // int rem = number % 2;
        // number /= 2;
        // result += rem;
        // }

        // System.out.println("result: "+result);
        Converter converter = new Converter();
        // System.out.println(converter.toBinary(number));
        System.out.println(converter.toDecimal(1010));

    }
}
