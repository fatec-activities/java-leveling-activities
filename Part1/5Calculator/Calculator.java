public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public void divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public void squareRoot(double number) {
        if (number < 0.0) {
            System.out.println("Error: Square root of a negative number is not real.");
        } else {
            System.out.println("Result: " + Math.sqrt(number));
        }
    }
}