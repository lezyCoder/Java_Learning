public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        int missing = (int) (expectedSum - actualSum);
        System.out.println("Missing element: " + missing);
    }
}