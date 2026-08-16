import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Utils util = new Utils();
        util.clearConsole();

        System.out.println("[ Bank ]");
        System.out.print("Enter the withdrawal amount: ");
        int cash = scanner.nextInt();

        CashManagement bank = new CashManagement(cash);

        bank.countBanknotes();

        scanner.close();
    }
}
