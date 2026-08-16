import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorMenu menu = new CalculatorMenu();

        menu.run(scanner);

        scanner.close();
    }
}