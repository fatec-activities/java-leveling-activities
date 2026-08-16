import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        PrimeAnalyzer analyzer = new PrimeAnalyzer();

        analyzer.run(scanner);

        scanner.close();
    }
}