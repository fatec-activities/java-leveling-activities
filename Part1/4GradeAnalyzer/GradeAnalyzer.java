import java.util.Scanner;

public class GradeAnalyzer {

    private final double grade1;
    private final double grade2;
    private final double grade3;

    public GradeAnalyzer(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public static double readValidGrade(Scanner scanner, String prompt) {
        double grade;

        while (true) {
            System.out.print(prompt);
            grade = scanner.nextDouble();

            if (grade >= 0.0 && grade <= 10.0) {
                return grade;
            }

            System.out.println("Invalid grade! Please enter a value between 0 and 10.\n");
        }
    }

    public double calculateAverage() {
        return (this.grade1 + this.grade2 + this.grade3) / 3.0;
    }

    public String getStatus() {
        double average = calculateAverage();

        if (average >= 7.0) {
            return "Approved";
        }
        if (average >= 5.0) {
            return "Retake (Recovery)";
        }

        return "Failed";
    }

    public void displayResults() {
        System.out.printf("\nAverage: %.2f", calculateAverage());
        System.out.println("\nStatus: " + getStatus());
    }
}