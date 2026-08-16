import java.util.Scanner;

public class NumberStreamAnalyzer {
    Utils util = new Utils();

    private int count = 0;
    private int sum = 0;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private int evenCount = 0;
    private int oddCount = 0;
    private int positiveCount = 0;
    private int negativeCount = 0;

    public void processNumbers(Scanner scanner) {
        System.out.println("[ NUMBER STREAM ANALYZER ]\n");

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            addNumber(number);
        }

        displayResults();
    }

    private void addNumber(int number) {
        this.count++;
        this.sum += number;

        if (number > this.max) {
            this.max = number;
        }

        if (number < this.min) {
            this.min = number;
        }

        if (number % 2 == 0) {
            this.evenCount++;
        } else {
            this.oddCount++;
        }

        if (number > 0) {
            this.positiveCount++;
        } else {
            this.negativeCount++;
        }
    }

    public double calculateAverage() {
        if (this.count == 0) {
            return 0.0;
        }

        return (double) this.sum / this.count;
    }

    public void displayResults() {
        util.clearConsole();

        System.out.println("[ RESULTS ]");

        if (this.count == 0) {
            System.out.println("\nNo numbers were entered.");

            return;
        }

        System.out.println();

        System.out.println("Quantity: " + this.count);
        System.out.println("Sum: " + this.sum);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Highest: " + this.max);
        System.out.println("Lowest: " + this.min);
        System.out.println("Evens: " + this.evenCount);
        System.out.println("Odds: " + this.oddCount);
        System.out.println("Positives: " + this.positiveCount);
        System.out.println("Negatives: " + this.negativeCount);
    }
}