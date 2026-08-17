import java.util.Scanner;

public class BankMenu {

    private final BankSystem bank = new BankSystem();
    private final Utils util = new Utils();

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
        System.out.println("[ BANK ]");
        System.out.println("1 - Check balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Extract");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1: {
                System.out.println("[ CHECK BALANCE ]\n");
                bank.displayBalance();
                break;
            }
            case 2: {
                System.out.println("[ DEPOSIT ]\n");
                double money = readDouble(scanner, "Enter deposit amount: $");
                bank.addCash(money);
                break;
            }
            case 3: {
                System.out.println("[ WITHDRAW ]\n");
                double money = readDouble(scanner, "Enter withdrawal amount: $");
                bank.subtractCash(money);
                break;
            }
            case 4: {
                System.out.println("[ EXTRACT ]\n");
                bank.displayHistory();
                break;
            }
            case 0: {
                System.out.println("Exiting Bank System... Goodbye!");
                break;
            }
            default: {
                System.out.println("Invalid option! Please select a valid menu choice.");
                break;
            }
        }
    }

    private double readDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private void pauseAndClear(Scanner scanner) {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}