import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        TypeDemo demo = new TypeDemo();
        Scanner scanner = new Scanner(System.in);

        demo.runDemonstration();
        demo.runDivisionDemo(scanner);

        scanner.close();
    }
}