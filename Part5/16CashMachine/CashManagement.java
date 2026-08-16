public class CashManagement {

    private final Utils util = new Utils();
    private final int cash;
    private final int[] banknotes = { 100, 50, 20, 10, 5, 2, 1 };

    public CashManagement(int cash) {
        this.cash = cash;
    }

    public void countBanknotes() {
        util.clearConsole();

        System.out.println("[ WITHDRAWAL RESULTS ]");

        if (this.cash <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a value greater than 0.");
            return;
        }

        System.out.println("Total Amount: $" + this.cash + "\n");

        int remainingCash = this.cash;

        for (int i = 0; i < this.banknotes.length; i++) {
            int noteValue = this.banknotes[i];
            int count = remainingCash / noteValue;

            if (count > 0) {
                System.out.println(count + " banknote(s) of $" + noteValue);
                remainingCash %= noteValue;
            }
        }
    }
}