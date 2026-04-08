// This program calculates the area and perimeter of different shapes based on user input.

//importing the Scanner class to read user input from the console.
import java.util.Scanner;

public class ShapeCalculator {
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user.
        Scanner in = new Scanner(System.in);
        // Displaying a welcome message and options for the user to select a shape.
        System.out.println("Welcome to the Shape Calculator!");
        // Prompting the user to select a shape for which they want to calculate the area and perimeter.
        System.out.println("Please select a shape to calculate its area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1-3): ");
        // Reading the user's choice as an integer.
        int choice = in.nextInt();

        // Using a switch statement to call the appropriate method based on the user's choice.
        switch (choice) {
            case 1:
                // If the user selects Circle, call the method to calculate the area and perimeter of a circle.
                calculateCircle(in);
                break;
            case 2:
                // If the user selects Rectangle, call the method to calculate the area and perimeter of a rectangle.
                calculateRectangle(in);
                break;
            case 3:
                // If the user selects Triangle, call the method to calculate the area and perimeter of a triangle.
                calculateTriangle(in);
                break;
                // If the user enters an invalid choice, display an error message.
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
        // Closing the Scanner object to prevent resource leaks.
        in.close();
    }
    // Method to calculate the area and perimeter of a circle based on user input.
    private static void calculateCircle(Scanner in) {
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble();
        calculateCircle(radius);
    }
    // Overloaded method to calculate the area and perimeter of a circle using the radius.
    private static void calculateCircle(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Area of Circle: %.2f\n", area);
        System.out.printf("Perimeter of Circle: %.2f\n", perimeter);
    }
    // Method to calculate the area and perimeter of a rectangle based on user input.
    private static void calculateRectangle(Scanner in) {
        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        calculateRectangle(length, width);
    }
    // Overloaded method to calculate the area and perimeter of a rectangle using the length and width.
    private static void calculateRectangle(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("Area of Rectangle: %.2f\n", area);
        System.out.printf("Perimeter of Rectangle: %.2f\n", perimeter);
    }
    // Method to calculate the area and perimeter of a triangle based on user input.
    private static void calculateTriangle(Scanner in) {
        System.out.print("Enter the base of the triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = in.nextDouble();
        System.out.print("Enter side1: ");
        double side1 = in.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = in.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = in.nextDouble();
        calculateTriangle(base, height, side1, side2, side3);
    }
    // Overloaded method to calculate the area and perimeter of a triangle using the base, height, and sides.
    private static void calculateTriangle(double base, double height, double side1, double side2, double side3) {
        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;
        System.out.printf("Area of Triangle: %.2f\n", area);
        System.out.printf("Perimeter of Triangle: %.2f\n", perimeter);
    }
}