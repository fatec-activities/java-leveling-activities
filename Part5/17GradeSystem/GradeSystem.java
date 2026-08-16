public class GradeSystem {

    private final Student[] students;

    public GradeSystem(Student[] students) {
        this.students = students;
    }

    public void displayIndividualResults() {
        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];

            System.out.println("[ STUDENT " + (i + 1) + "]");
          
            System.out.printf("\nNote 1: %.2f", student.getNote1());
            System.out.printf("\nNote 2: %.2f", student.getNote2());
            System.out.printf("\nNote 3: %.2f", student.getNote3());

            System.out.println();

            System.out.printf("\nAverage: %.2f", student.getAverage());
            System.out.println("\nStatus: " + student.getStatus());

            System.out.println();
        }
    }

    public void displayClassStatistics() {
        System.out.println("[ CLASS STATISTICS ]");
       
        System.out.printf("\nClass Average: %.2f", getClassAverage());
        System.out.printf("\nHighest Average: %.2f", getHighestAverage());
        System.out.printf("\nLowest Average: %.2f", getLowestAverage());
     
        System.out.println("\nApproved count: " + getApprovedCount());
        System.out.println("\nRecovery count: " + getRecoveryCount());
        System.out.println("\nFailed count: " + getFailedCount());
       
        System.out.println();
    }

    public double getClassAverage() {
        double sum = 0.0;

        for (int i = 0; i < this.students.length; i++) {
            sum += this.students[i].getAverage();
        }

        return sum / this.students.length;
    }

    public double getHighestAverage() {
        double highest = this.students[0].getAverage();

        for (int i = 1; i < this.students.length; i++) {
            if (this.students[i].getAverage() > highest) {
                highest = this.students[i].getAverage();
            }
        }

        return highest;
    }

    public double getLowestAverage() {
        double lowest = this.students[0].getAverage();

        for (int i = 1; i < this.students.length; i++) {
            if (this.students[i].getAverage() < lowest) {
                lowest = this.students[i].getAverage();
            }
        }

        return lowest;
    }

    public int getApprovedCount() {
        int count = 0;

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getStatus().equals("Approved")) {
                count++;
            }

        }

        return count;
    }

    public int getRecoveryCount() {
        int count = 0;

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getStatus().equals("Recovery")) {
                count++;
            }
        }

        return count;
    }

    public int getFailedCount() {
        return this.students.length - getApprovedCount() - getRecoveryCount();
    }
}