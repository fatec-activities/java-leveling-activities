public class VectorSearch {

    private int[] numbers;

    Utils util = new Utils();

    public VectorSearch(int[] numbers) {
        this.numbers = numbers;
    }

    public void searchNumber(int target) {
        util.clearConsole();

        int count = getOccurrencesCount(target);

        System.out.println("[ SEARCH RESULTS ]");

        if (count == 0) {
            System.out.println("The number " + target + " was not found.");
            return;
        }

        System.out.println("The number " + target + " was found " + count + " time(s).");
        System.out.println("\nPositions (indices):");

        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == target) {
                System.out.print(i + ", ");
            }
        }
    }

    private int getOccurrencesCount(int target) {
        int count = 0;

        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == target) {
                count++;
            }
        }

        return count;
    }
}