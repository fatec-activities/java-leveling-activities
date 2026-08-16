import java.util.Scanner;

public class TypeDemo {

    public void runDemonstration() {
        // Types declaration
        byte byteVar = 50;
        short shortVar = 1000;
        long longVar = 100000L;
        float floatVar = 50.5f;
        double doubleVar = 99.99;
        char charVar = 'A';

        System.out.println("[ CASTING & PROMOTION DEMO ]\n");

        conversions(longVar, floatVar);
        dataLoss(doubleVar);
        promotionAndChar(shortVar, byteVar, charVar);
    }

    private void conversions(long longVar, float floatVar) {
        // Implicit conversion
        double implicitDouble = longVar;
        System.out.println("Implicit Conversion (long -> double): " + implicitDouble);

        // Explicit conversion
        short explicitShort = (short) floatVar;
        System.out.println("Explicit Conversion (float -> short): " + explicitShort);
    }

    private void dataLoss(double doubleVar) {
        int bigValue = 128;
        byte overflowByte = (byte) bigValue;
        int truncatedInt = (int) doubleVar;

        System.out.println("Data Loss (double 99.99 -> int): " + truncatedInt + " (Lost decimals)");
        System.out.println("Data Loss / Overflow (int 128 -> byte): " + overflowByte + " (Exceeded byte limit of 127)");
    }

    private void promotionAndChar(short shortVar, byte byteVar, char charVar) {
        // Type promotion
        int promotedResult = shortVar + byteVar;
        System.out.println("Numeric Promotion (short + byte -> int): " + promotedResult);

        // Char arithmetic
        int charSum = charVar + 5;
        char newChar = (char) charSum;
        System.out.println("Char Operation ('A' + 5) = " + charSum + " (Resulting character: '" + newChar + "')");
    }

    public void runDivisionDemo(Scanner scanner) {
        System.out.println("\n[ INTEGER VS FLOATING-POINT DIVISION ]");

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        int resultInt = a / b;
        double resultDouble = (double) a / b;

        System.out.println("\nResult of a / b = " + resultInt);
        System.out.println("Result of (double) a / b = " + resultDouble);
    }
}