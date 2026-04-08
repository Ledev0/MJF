import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a non-negative integer to calculate Fibonacci numbers up to that number
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        // Check if the input is negative and handle it accordingly
        if (n < 0) {
            // If the input is negative, display an error message
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            // If the input is valid, calculate and display the Fibonacci numbers up to n
            System.out.println("First " + n + " Fibonacci numbers:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
                if ((i + 1) % 10 == 0)
                    System.out.println(); // 
            }
            System.out.println();
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
    // Method to calculate the nth Fibonacci number using recursion
    public static long fibonacci(int n) {
        if (n < 0)
            // Throw an exception for negative input
            throw new IllegalArgumentException("Negative input");
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}