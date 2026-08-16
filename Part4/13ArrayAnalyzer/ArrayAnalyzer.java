public class ArrayAnalyzer {

    private int[] numbers;

    Utils util = new Utils();

    public ArrayAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    public void displayStatistics() {
        util.clearConsole();

        System.out.println("[ RESULTS ]");

        displayNumbers();

        System.out.println("Sum: " + getSum());
        System.out.printf("Average: %.1f%n", getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
        System.out.println("Evens: " + getEvenCount());
        System.out.println("Odds: " + getOddCount());
    }

    private void displayNumbers() {
        System.out.print("Numbers entered: ");
        
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i] + ", ");
        }
        
        System.out.println("\n");
    }

    public int getSum() {
        int sum = 0;
     
        for (int i = 0; i < this.numbers.length; i++) {
            sum += this.numbers[i];
        }
      
        return sum;
    }

    public double getAverage() {
        return (double) getSum() / this.numbers.length;
    }

    public int getHighest() {
        int max = this.numbers[0];
       
        for (int i = 1; i < this.numbers.length; i++) {
            if (this.numbers[i] > max) {
                max = this.numbers[i];
            }
        }
       
        return max;
    }

    public int getLowest() {
        int min = this.numbers[0];
       
        for (int i = 1; i < this.numbers.length; i++) {
            if (this.numbers[i] < min) {
                min = this.numbers[i];
            }
        }
      
        return min;
    }

    public int getEvenCount() {
        int count = 0;
        
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] % 2 == 0) {
                count++;
            }
        }
      
        return count;
    }

    public int getOddCount() {
        return this.numbers.length - getEvenCount();
    }
}