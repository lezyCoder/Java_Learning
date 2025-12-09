package Day01_Variables;
public class TypeCasting {
    public static void main(String[] args) {
        // TODO: Create an int variable with value 100
        // TODO: Convert it to double and store in new variable
        // TODO: Create a double variable with value 99.99
        // TODO: Convert it to int (what happens to .99?)
        // TODO: Print both results

        int integerValue = 100;

        double doubleValue = (integerValue);

        double value= 99.99;

        int value2 = (int)(value);

        System.out.println(doubleValue);
        System.out.println(value2); // this is not working 

    }

}