import java.util.ArrayList;
import java.util.List;

public class BankSystem {

    private double cash;
    private final List<String> operationHistory;

    public BankSystem() {
        this.cash = 0.0;
        this.operationHistory = new ArrayList<>();
    }

    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f%n", this.cash);
        updateHistory("Balance Check: $", this.cash);
    }

    public void addCash(double amount) {
        if (amount <= 0.0) {
            System.out.println("Invalid amount! Deposit must be greater than zero.");
            return;
        }

        this.cash += amount;
        System.out.printf("Successfully deposited $%.2f%n", amount);
        System.out.printf("Current Balance: $%.2f%n", this.cash);

        updateHistory("Deposit: + $", amount);
    }

    public void subtractCash(double amount) {
        if (amount <= 0.0) {
            System.out.println("Invalid amount! Withdrawal must be greater than zero.");
            return;
        }

        if (amount > this.cash) {
            System.out.println("Insufficient funds! Your current balance is $" + String.format("%.2f", this.cash));
            return;
        }

        this.cash -= amount;
        System.out.printf("Successfully withdrew $%.2f%n", amount);
        System.out.printf("Current Balance: $%.2f%n", this.cash);

        updateHistory("Withdrawal: - $", amount);
    }

    private void updateHistory(String operation, double amount) {
        this.operationHistory.add(String.format("%s%.2f", operation, amount));
    }

    public void displayHistory() {
        if (this.operationHistory.isEmpty()) {
            System.out.println("No operations recorded yet.");
            return;
        }

        for (String record : this.operationHistory) {
            System.out.println(record);
        }

        System.out.println("\n---");
        System.out.printf("Current Balance: $%.2f%n", this.cash);
    }
}