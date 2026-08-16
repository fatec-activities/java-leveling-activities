import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils util = new Utils();
        util.clearConsole();

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ GRADE SYSTEM ]\n");
        System.out.print("How many students will be registered? ");
        int totalStudents = scanner.nextInt();

        Student[] registeredStudents = new Student[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            util.clearConsole();
            System.out.println("> Registering Student " + (i + 1) + "/" + totalStudents);

            System.out.print("Note 1: ");
            double n1 = scanner.nextDouble();

            System.out.print("Note 2: ");
            double n2 = scanner.nextDouble();

            System.out.print("Note 3: ");
            double n3 = scanner.nextDouble();

            registeredStudents[i] = new Student(n1, n2, n3);
        }

        util.clearConsole();

        GradeSystem grades = new GradeSystem(registeredStudents);
        grades.displayIndividualResults();
        grades.displayClassStatistics();

        scanner.close();
    }
}