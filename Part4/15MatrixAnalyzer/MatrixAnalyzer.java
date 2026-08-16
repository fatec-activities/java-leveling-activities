public class MatrixAnalyzer {

    private int[][] matrix;
    private int rows;
    private int cols;

    Utils util = new Utils();

    public MatrixAnalyzer(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public void displayAnalysis() {
        util.clearConsole();

        System.out.println("[ RESULTS ]\n");

        displayMatrix();

        System.out.println("Sum of all elements: " + getSum());
        System.out.println("Highest element: " + getHighest());
        System.out.println("Lowest element: " + getLowest());

        displayMainDiagonal();
        displaySecondaryDiagonal();

        System.out.println("Sum of main diagonal: " + getMainDiagonalSum());
        System.out.println("Sum of secondary diagonal: " + getSecondaryDiagonalSum());
        System.out.println("Even elements count: " + getEvenCount());
    }

    private void displayMatrix() {
        System.out.println("Matrix Elements:");

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.printf("%4d", this.matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public int getSum() {
        int sum = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                sum += this.matrix[i][j];
            }
        }

        return sum;
    }

    public int getHighest() {
        int max = this.matrix[0][0];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.matrix[i][j] > max) {
                    max = this.matrix[i][j];
                }
            }

        }

        return max;
    }

    public int getLowest() {
        int min = this.matrix[0][0];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.matrix[i][j] < min) {
                    min = this.matrix[i][j];
                }
            }
        }

        return min;
    }

    private void displayMainDiagonal() {
        System.out.print("Main diagonal elements: ");

        for (int i = 0; i < this.rows; i++) {
            System.out.print(this.matrix[i][i] + " ");
        }

        // 2 1 1 1
        // 1 2 1 1
        // 1 1 2 1
        // 1 1 1 2

        System.out.println();
    }

    private void displaySecondaryDiagonal() {
        System.out.print("Secondary diagonal elements: ");

        for (int i = 0; i < this.rows; i++) {
            System.out.print(this.matrix[i][this.cols - 1 - i] + " ");
        }

        // 1 1 1 2
        // 1 1 2 1
        // 1 2 1 1
        // 2 1 1 1

        System.out.println();
    }

    public int getMainDiagonalSum() {
        int sum = 0;

        for (int i = 0; i < this.rows; i++) {
            sum += this.matrix[i][i];
        }

        return sum;
    }

    public int getSecondaryDiagonalSum() {
        int sum = 0;

        for (int i = 0; i < this.rows; i++) {
            sum += this.matrix[i][this.cols - 1 - i];
        }

        return sum;
    }

    public int getEvenCount() {
        int count = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}