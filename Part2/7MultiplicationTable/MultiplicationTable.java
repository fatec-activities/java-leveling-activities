import java.util.Scanner;

public class MultiplicationTable {
    public void displaySingleTable(Scanner scanner) {
        System.out.println("[ SINGLE MULTIPLICATION TABLE ]\n");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println();
        printTable(number);
    }

    public void displayAllTables() {
        System.out.println("[ ALL MULTIPLICATION TABLES (1 to 10) ]\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("[ Table of " + i + " ]");
            printTable(i);
            System.out.println();
        }
    }

    private void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}