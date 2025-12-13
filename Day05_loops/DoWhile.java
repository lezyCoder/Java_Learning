public class DoWhile {
    public static void main(String args[]) {
        int x = 10;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }
}

/*
 * Java do while loop is similar to a while loop, except that a do while loop is
 * guaranteed to execute at least one time.
 * 
 * The do-while loop is an exit control loop where the condition is checked
 * after executing the loop's body.
 */