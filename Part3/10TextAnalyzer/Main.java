import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ TEXT ANALYZER ]\n");

        System.out.print("Enter a phrase: ");
        String text = scanner.nextLine();

        TextAnalyzer analyzer = new TextAnalyzer(text);
        analyzer.displayAnalysis();

        scanner.close();
    }
}