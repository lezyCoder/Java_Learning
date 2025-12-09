package Day01_Variables;
public class AreaCalculator {
    public static void main(String[] args) {
        // TODO: Create variables for length and width
        // TODO: Calculate area = length * width
        // TODO: Print the result
        
        // Test with: length = 15.5, width = 10.2
        // Expected output: Area of rectangle: 158.1

        float length =15.5f;
        float width =10.2f;

        float area = length  *  width;

        System.out.printf("Area %.2f", area);  

    }
}