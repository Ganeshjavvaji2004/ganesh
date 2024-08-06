public class OddNumbersPrinter {
    public static void main(String[] args) {
        // Define the range
        int start = 1;
        int end = 100;

        // Print odd numbers within the range
        System.out.println("Odd numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline after the list
    }
}