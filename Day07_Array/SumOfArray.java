import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array sum is : ");
        int sum = 0 ;
        for (int i = 0; i < 5; i++) {
            
            sum =  sum +  numbers[i];
        }
       System.out.print(sum);
        sc.close();
    }
}
