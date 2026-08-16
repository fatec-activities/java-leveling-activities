import java.util.Scanner;

public class CalculatorMenu {

    private Calculator calculator = new Calculator();
    private Utils util = new Utils();

    public void run(Scanner scanner) {
        int option = -1;

        while (option != 0) {
            util.clearConsole();
            displayMenu();
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            util.clearConsole();

            processOption(option, scanner);

            if (option != 0) {
                pauseAndClear(scanner);
            }
        }
    }

    private void displayMenu() {
        System.out.println("[ CALCULATOR ]");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Power");
        System.out.println("6 - Square root");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1: {
                System.out.println("[ ADDITION ]\n");
                double a = readNumber(scanner, "Enter first number: ");
                double b = readNumber(scanner, "Enter second number: ");
                System.out.println("Result: " + calculator.add(a, b));
                break;
            }
            case 2: {
                System.out.println("[ SUBTRACTION ]\n");
                double a = readNumber(scanner, "Enter first number: ");
                double b = readNumber(scanner, "Enter second number: ");
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            }
            case 3: {
                System.out.println("[ MULTIPLICATION ]\n");
                double a = readNumber(scanner, "Enter first number: ");
                double b = readNumber(scanner, "Enter second number: ");
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            }
            case 4: {
                System.out.println("[ DIVISION ]\n");
                double a = readNumber(scanner, "Enter dividend: ");
                double b = readNumber(scanner, "Enter divisor: ");
                calculator.divide(a, b);
                break;
            }
            case 5: {
                System.out.println("[ POWER ]\n");
                double base = readNumber(scanner, "Enter base: ");
                double exponent = readNumber(scanner, "Enter exponent: ");
                System.out.println("Result: " + calculator.power(base, exponent));
                break;
            }
            case 6: {
                System.out.println("[ SQUARE ROOT ]\n");
                double number = readNumber(scanner, "Enter number: ");
                calculator.squareRoot(number);
                break;
            }
            case 0: {
                System.out.println("Exiting calculator... Goodbye!");
                break;
            }
            default: {
                System.out.println("Invalid option! Please select a valid menu choice.");
                break;
            }
        }
    }

    private double readNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private void pauseAndClear(Scanner scanner) {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}