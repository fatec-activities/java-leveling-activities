import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        NumberStreamAnalyzer analyzer = new NumberStreamAnalyzer();

        analyzer.processNumbers(scanner);

        scanner.close();
    }
}