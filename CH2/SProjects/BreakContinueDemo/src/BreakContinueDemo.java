public class BreakContinueDemo {
    public static void main(String[] args) {
        // Demonstrating break statement
        System.out.println("Demonstrating break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        // Demonstrating continue statement
        System.out.println("\nDemonstrating continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop when i is even
            }
            System.out.println(i);
        }
    }
}