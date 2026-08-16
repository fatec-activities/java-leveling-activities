public class Utils {
    public void clearConsole() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.flush();
    }
}