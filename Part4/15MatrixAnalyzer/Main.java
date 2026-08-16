import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);
        int rows = 4;
        int cols = 4;
        int[][] inputMatrix = new int[rows][cols];

        System.out.println("[ MATRIX ANALYZER (4x4) ]\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                inputMatrix[i][j] = scanner.nextInt();
            }
        }

        MatrixAnalyzer analyzer = new MatrixAnalyzer(inputMatrix);
        analyzer.displayAnalysis();

        scanner.close();
    }
}