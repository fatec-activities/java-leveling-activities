import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankMenu menu = new BankMenu();

        menu.run(scanner);

        scanner.close();
    }
}