/*
 * A for each loop is a special repetition control structure that allows you to
 * efficiently write a loop that needs to be executed a specific number of
 * times.
 * 
 * A for each loop is useful even when you do not know how many times a task is
 * to be repeated.
 */

import java.util.Arrays;
import java.util.List;

public class ForEach {

   public static void main(String args[]) {
      List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

      for(Integer x : numbers ) {
         System.out.print( x );
         System.out.print(",");
      }
   }
}