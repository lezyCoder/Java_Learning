public class BMICalculatorEnhanced {
    public static void main(String[] args) {
        double weight = 70.5;
        double height = 1.75;
        
        double BMI = weight / (height * height);
        
        System.out.printf("═══════════════════════════════%n");
        System.out.printf("     BMI CALCULATOR RESULTS    %n");
        System.out.printf("═══════════════════════════════%n");
        System.out.printf("Weight: %.1f kg%n", weight);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("Your BMI: %.2f%n", BMI);
        System.out.printf("═══════════════════════════════%n");
        
        // BMI Categories:
        if (BMI < 18.5) {
            System.out.printf("Category: Underweight%n");
        } else if (BMI < 25) {
            System.out.printf("Category: Normal weight%n");
        } else if (BMI < 30) {
            System.out.printf("Category: Overweight%n");
        } else {
            System.out.printf("Category: Obese%n");
        }
    }
}