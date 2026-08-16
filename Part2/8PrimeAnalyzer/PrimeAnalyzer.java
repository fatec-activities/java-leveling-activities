import java.util.Scanner;

public class PrimeAnalyzer {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void run(Scanner scanner) {
        System.out.println("[ PRIME NUMBER CHECKER ]\n");

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println();
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        System.out.println("\n[ PRIMES FROM 1 TO " + number + " ]");
        displayPrimesUpTo(number);
    }

    private void displayPrimesUpTo(int limit) {
        if (limit < 2) {
            System.out.println("There are no prime numbers in this range.");
            return;
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}