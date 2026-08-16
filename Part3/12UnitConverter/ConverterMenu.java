import java.util.Scanner;

public class ConverterMenu {

    private final UnitConverter converter = new UnitConverter();
    private final Utils util = new Utils();

    public void run(Scanner scanner) {
        int option = -1;

        while (option != 0) {
            util.clearConsole();
            displayMenu();
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            util.clearConsole();

            processOption(option, scanner);

            if (option != 0) {
                pauseAndClear(scanner);
            }
        }
    }

    private void displayMenu() {
        System.out.println("===========================");
        System.out.println("       UNIT CONVERTER      ");
        System.out.println("===========================");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius");
        System.out.println("3 - Meters to Kilometers");
        System.out.println("4 - Kilometers to Meters");
        System.out.println("5 - Degrees to Radians");
        System.out.println("6 - Radians to Degrees");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1: {
                System.out.println("[ CELSIUS TO FAHRENHEIT ]\n");
                double celsius = readValue(scanner, "Enter temperature in Celsius: ");
                System.out.printf("Result: %.2f °F%n", converter.celsiusToFahrenheit(celsius));
                break;
            }
            case 2: {
                System.out.println("[ FAHRENHEIT TO CELSIUS ]\n");
                double fahrenheit = readValue(scanner, "Enter temperature in Fahrenheit: ");
                System.out.printf("Result: %.2f °C%n", converter.fahrenheitToCelsius(fahrenheit));
                break;
            }
            case 3: {
                System.out.println("[ METERS TO KILOMETERS ]\n");
                double meters = readValue(scanner, "Enter distance in meters: ");
                System.out.printf("Result: %.3f km%n", converter.metersToKilometers(meters));
                break;
            }
            case 4: {
                System.out.println("[ KILOMETERS TO METERS ]\n");
                double kilometers = readValue(scanner, "Enter distance in kilometers: ");
                System.out.printf("Result: %.2f m%n", converter.kilometersToMeters(kilometers));
                break;
            }
            case 5: {
                System.out.println("[ DEGREES TO RADIANS ]\n");
                double degrees = readValue(scanner, "Enter angle in degrees: ");
                System.out.printf("Result: %.4f rad%n", converter.degreesToRadians(degrees));
                break;
            }
            case 6: {
                System.out.println("[ RADIANS TO DEGREES ]\n");
                double radians = readValue(scanner, "Enter angle in radians: ");
                System.out.printf("Result: %.2f°%n", converter.radiansToDegrees(radians));
                break;
            }
            case 0: {
                System.out.println("Exiting converter... Goodbye!");
                break;
            }
            default: {
                System.out.println("Invalid option! Please select a valid menu choice.");
                break;
            }
        }
    }

    private double readValue(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private void pauseAndClear(Scanner scanner) {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}