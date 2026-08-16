public class Student {

    private final double note1;
    private final double note2;
    private final double note3;

    public Student(double note1, double note2, double note3) {
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    public double getAverage() {
        return (this.note1 + this.note2 + this.note3) / 3.0;
    }

    public String getStatus() {
        double average = getAverage();

        if (average >= 7.0) {
            return "Approved";
        } else if (average >= 5.0) {
            return "Recovery";
        } else {
            return "Failed";
        }
    }

    public double getNote1() {
        return this.note1;
    }

    public double getNote2() {
        return this.note2;
    }

    public double getNote3() {
        return this.note3;
    }
}