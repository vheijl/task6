public class BMI {
    public static void main(String[] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double bmi = weight / Math.pow(height, 2);

        if (bmi > 0 && bmi < 18.5) {
            // Underweight
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            // Normal weight
            System.out.println("Normal weight");
        } else if (bmi >= 15 && bmi < 29.9) {
            // Overweight
            System.out.println("Overweight");
        } else {
            // Obese
            System.out.println("Obese");
        }
    }
}