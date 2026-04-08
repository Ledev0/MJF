// This is a simple calculator program that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on two numbers entered by the user. The program uses methods to perform each operation and handles division by zero appropriately.

// importing the Scanner class to read user input
import java.util.Scanner;

public class CalculatorMethods {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Displaying a welcome message to the user
        System.out.println("Welcome to the calculator");

        // Prompting the user to enter the first number and reading it
        System.out.print("Please Enter First Number : ");
        double num1 = in.nextDouble();

        // Prompting the user to enter the second number and reading it
        System.out.print("Please Enter Second Number : ");
        double num2 = in.nextDouble();

        // Performing the arithmetic operations and displaying the results
        System.out.println("The sum of the two numbers is : " + sum(num1, num2));
        System.out.println("The subtraction of the two numbers is : " + sub(num1, num2));
        System.out.println("The multiplication of the two numbers is : " + multi(num1, num2));
        System.out.println("The division of the two numbers is : " + div(num1, num2));

        // Closing the Scanner object to prevent resource leaks
        in.close();

    }

    // Method to perform addition of two numbers
    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction of two numbers
    static double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication of two numbers
    static double multi(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division of two numbers, with error handling for division by zero
    static double div(double num1, double num2) {
        if (num2 == 0) {
            // If the second number is zero, print an error message and return NaN (Not a Number)
            System.out.println("Can not divide by zero");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }
}