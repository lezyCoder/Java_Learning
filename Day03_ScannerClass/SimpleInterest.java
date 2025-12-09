import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of Interest (R) per annum: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time Period (T) in years: ");
        double time = scanner.nextDouble();
        
        // Simple Interest formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        // Amount = Principal + Simple Interest
        double amount = principal + simpleInterest;
        
        System.out.println("\n--- Results ---");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + amount);
        
        scanner.close();
    }
}
