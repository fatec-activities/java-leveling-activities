import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        int totalElements = 15;
        int[] inputNumbers = new int[totalElements];

        System.out.println("[ VECTOR SEARCH ]\n");

        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter number " + (i + 1) + "/" + totalElements + ": ");
            inputNumbers[i] = scanner.nextInt();
        }

        System.out.print("\nEnter a number to search: ");
        int target = scanner.nextInt();

        VectorSearch searcher = new VectorSearch(inputNumbers);
        searcher.searchNumber(target);

        scanner.close();
    }
}