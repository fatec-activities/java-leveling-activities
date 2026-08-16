import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ PALINDROME CHECKER ]\n");

        System.out.print("Enter a word: ");
        String input = scanner.next();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        scanner.close();
    }
}