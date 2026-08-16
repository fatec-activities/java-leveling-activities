import java.util.Scanner;

public class GuessingGame {

    private Utils util = new Utils();

    public void start(Scanner scanner) {
        System.out.println("[ GUESSING GAME ]\n");

        int maxAttempts = chooseDifficulty(scanner);
        int targetNumber = (int) (Math.random() * 100) + 1;

        util.clearConsole();
        System.out.println("[ GAME STARTED ]");
        System.out.println("Guess a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it!\n");

        int attempts = 0;
        boolean hasWon = false;

        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Attempt " + attempts + "/" + maxAttempts + " - Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                hasWon = true;
                break;
            }

            if (guess < targetNumber) {
                System.out.println("The number is higher.\n");
            } else {
                System.out.println("The number is lower.\n");
            }
        }

        System.out.println("\n[ GAME OVER ]");
        if (hasWon) {
            System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            System.out.println("Total attempts used: " + attempts);
        } else {
            System.out.println("You ran out of attempts!");
            System.out.println("The secret number was: " + targetNumber);
        }
    }

    public int chooseDifficulty(Scanner scanner) {
        int choice = 0;

        while (choice < 1 || choice > 3) {
            System.out.println("Select Difficulty:");
            System.out.println("1 - Easy (15 attempts)");
            System.out.println("2 - Medium (10 attempts)");
            System.out.println("3 - Hard (5 attempts)");
            System.out.print("Choice: ");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Please select 1, 2, or 3.\n");
            }
        }

        switch (choice) {
            case 1: {
                return 15;
            }
            case 2: {
                return 10;
            }
            case 3: {
                return 5;
            }
            default: {
                return 10;
            }
        }
    }
}