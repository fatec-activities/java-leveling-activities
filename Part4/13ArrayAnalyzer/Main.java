import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        int totalElements = 10;
        int[] inputNumbers = new int[totalElements];

        System.out.println("[ VECTOR STATISTICS ]\n");

        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter number " + (i + 1) + "/" + totalElements + ": ");
            inputNumbers[i] = scanner.nextInt();
        }

        ArrayAnalyzer analyzer = new ArrayAnalyzer(inputNumbers);
        analyzer.displayStatistics();

        scanner.close();
    }
}