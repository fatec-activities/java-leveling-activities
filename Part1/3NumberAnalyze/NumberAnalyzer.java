public class NumberAnalyzer {

    private int a;
    private int b;
    private int c;

    public NumberAnalyzer(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayResults() {
        System.out.println("\n[ RESULTS ]");

        if (areAllEqual()) {
            System.out.println("All three numbers are equal.");
        } else {
            System.out.println("The numbers are not all equal.");
        }

        System.out.println("Highest number: " + getHighest());
        System.out.println("Lowest number: " + getLowest());
        System.out.println("Average: " + getAverage());
        System.out.println("Even count: " + getEvenCount());
        System.out.println("Odd count: " + getOddCount());
    }

    public boolean areAllEqual() {
        return this.a == this.b && this.b == this.c;
    }

    public int getHighest() {
        int max = this.a;

        if (this.b > max) {
            max = this.b;
        }

        if (this.c > max) {
            max = this.c;
        }

        return max;
    }

    public int getLowest() {
        int min = this.a;

        if (this.b < min) {
            min = this.b;
        }
        if (this.c < min) {
            min = this.c;
        }

        return min;
    }

    public double getAverage() {
        return (double) (this.a + this.b + this.c) / 3;
    }

    public int getEvenCount() {
        int count = 0;

        if (isEven(this.a)) {
            count++;
        }
        if (isEven(this.b)) {
            count++;
        }
        if (isEven(this.c)) {
            count++;
        }

        return count;
    }

    public int getOddCount() {
        return 3 - getEvenCount();
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}