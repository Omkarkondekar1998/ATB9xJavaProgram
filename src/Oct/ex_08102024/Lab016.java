package Oct.ex_08102024;

public class Lab016 {

    public static void main(String[] args) {
        // byte: 1 byte (8 bits), range: -128 to 127
        byte smallNumber = 100;
        System.out.println("Byte: " + smallNumber);

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        short mediumNumber = 30000;
        System.out.println("Short: " + mediumNumber);

        // int: 4 bytes (32 bits), range: -2,147,483,648 to 2,147,483,647
        int largeNumber = 200000;
        System.out.println("Int: " + largeNumber);

        // long: 8 bytes (64 bits), very large range
        long veryLargeNumber = 10000000000L;
        System.out.println("Long: " + veryLargeNumber);

        // float: 4 bytes (32 bits), for decimal numbers
        float decimalNumber = 3.14f;
        System.out.println("Float: " + decimalNumber);

        // double: 8 bytes (64 bits), for more precise decimal numbers
        double preciseDecimal = 3.14159265359;
        System.out.println("Double: " + preciseDecimal);

        // char: 2 bytes (16 bits), for a single character
        char letter = 'A';
        System.out.println("Char: " + letter);

        // boolean: 1 byte (8 bits), true or false
        boolean isTrue = true;
        System.out.println("Boolean: " + isTrue);
    }
}
