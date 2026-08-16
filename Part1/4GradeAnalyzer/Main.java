import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ GRADE CLASSIFICATION ]\n");

        double grade1 = GradeAnalyzer.readValidGrade(scanner, "Enter first grade: ");
        double grade2 = GradeAnalyzer.readValidGrade(scanner, "Enter second grade: ");
        double grade3 = GradeAnalyzer.readValidGrade(scanner, "Enter third grade: ");

        GradeAnalyzer analyzer = new GradeAnalyzer(grade1, grade2, grade3);
        analyzer.displayResults();

        scanner.close();
    }
}