// In this code we will take the input from the user for the array and print it 

import java.util.Scanner;

public class ArrayInput {

    public static void main() {

        // Creating the array
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        // taking integer as input
        System.out.println("Enter Inputs: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Printing the output
        System.out.print("Array elements are :  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}