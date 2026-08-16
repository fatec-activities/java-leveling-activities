import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ NUMBER ANALYZER ]\n");

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third integer (c): ");
        int c = scanner.nextInt();

        NumberAnalyzer analyzer = new NumberAnalyzer(a, b, c);
        analyzer.displayResults();

        scanner.close();
    }
}