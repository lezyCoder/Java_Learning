import java.util.Scanner;

// package Day03_ScannerClass;

public class TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating the Input object using Scanner class.
        System.out.println("Enter Inputs: ");
        int number = sc.nextInt(); // taking the input number
        System.out.println(number);

        // taking string input
        System.out.println("Enter name: ");
        String name = sc.next(); // this will take the single word as input but it will not read the space
                                 // between two word so it will take input of single element
        System.out.println("your name is " + name);

        // taking input in string
        System.out.println("Enter name: ");
        String nameee = sc.nextLine(); // this will take the whole sentence as input and it will read the space as well
        // between two word so it will take input of single element
        System.out.println("your name is " + nameee);

    }
}

/*
 * in order to take the input
 * we first import the package import java.util.Scanner;
 * create the object of Scanner class
 * 
 * 
 * 
 */