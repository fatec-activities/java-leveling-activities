import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        MultiplicationTable table = new MultiplicationTable();

        table.displaySingleTable(scanner);

        System.out.print("\nPress Enter to view all tables from 1 to 10...");
        scanner.nextLine();
        scanner.nextLine();

        util.clearConsole();

        table.displayAllTables();

        scanner.close();
    }
}