package Day01_Variables;
public class PersonalInfo {
    public static void main(String[] args) {
        // TODO: Create variables for:
        // 1. Your name (String)
        String name = "Vijay";
        // 2. Your age (int)
        int age = 26;

        // 3. Your height in meters (double)
        double height = 1.75;
        // 4. Are you a student? (boolean)
        boolean isStudent = false;
        // 5. Your grade/rating (char)
        char grade = 'A';

        // TODO: Print all information in a formatted way

        // Expected Output:
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Height: %.2f meters%n", height);
        System.out.printf("Is Student: %s%n", isStudent);
        System.out.printf("Grade: %c%n", grade);

        System.out.printf("Name: %s, Age: %d, height: %.2f%n", name, age, height);
    }
}