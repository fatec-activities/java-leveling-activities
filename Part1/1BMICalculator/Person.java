public class Person {
    String name;
    float weight;
    float height;
    int age;

    public void printResult() {
        String bmi = String.format("%.2f", this.calculateBMI());

        System.out.println("[ Person info: ]" +
                "\n- Name: " + this.name +
                "\n- Weight: " + this.weight + " kg" +
                "\n- Height: " + this.height + " cm" +
                "\n- Age: " + this.age +
                "\n\n> BMI: " + bmi);
    }

    public float calculateBMI() {
        float heightInMeters = this.height / 100;
        return this.weight / (heightInMeters * heightInMeters);
    }
}