public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Method to calculate the factorial of a number using recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }
}