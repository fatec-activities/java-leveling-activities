import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        person.name = scanner.nextLine();

        System.out.print("Weight: ");
        person.weight = scanner.nextFloat();

        System.out.print("Height (cm): ");
        person.height = scanner.nextFloat();

        System.out.print("Age: ");
        person.age = scanner.nextInt();

        util.clearConsole();
        person.printResult();

        scanner.close();
    }
}