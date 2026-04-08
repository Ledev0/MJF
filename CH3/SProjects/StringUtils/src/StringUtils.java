
// A Simple Java Program to Demonstrate Various String Methods
import java.util.Scanner;

// This program takes a user input string and demonstrates various string methods available in Java.
public class StringUtils {
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Sentence : ");
        String input = in.nextLine(); // اسم أفضل

        System.out.println("\n===== String Methods Demo =====");
        System.out.println("Original : \"" + input + "\"");
        System.out.println("The Length of Sentence is : " + input.length());

        if (input.length() > 0) {
            System.out.println("The First Character is : " + input.charAt(0));
            System.out.println("Last Character is : " + input.charAt(input.length() - 1));
        } else {
            System.out.println("The First Character is : (empty string)");
            System.out.println("Last Character is : (empty string)");
        }

        System.out.println("Uppercase is : " + input.toUpperCase());
        System.out.println("Lowercase is : " + input.toLowerCase());

        // Safe substring
        int endIndex = Math.min(3, input.length());
        System.out.println("First " + endIndex + " Chars is : " + input.substring(0, endIndex));

        System.out.println("Contains The Letter 'e' : " + input.contains("e"));
        System.out.println("Start With 'Hi'? : " + input.startsWith("Hi"));
        System.out.println("Replace 's' with '$' : " + input.replace('s', '$'));
        System.out.println("Ends With '!'? : " + input.endsWith("!"));
        System.out.println("First Space At Index: " + input.indexOf(' '));
        System.out.println("Trimmed Sentence: \"" + input.trim() + "\"");
        System.out.println("Split by Space: " + String.join(", ", input.split(" ")));
        System.out.println("Is Empty? : " + input.isEmpty());
        System.out.println("Is Blank? : " + input.isBlank()); // Java 11+
        System.out.println("Repeat 3 Times: " + input.repeat(3));
        System.out.println("Formatted String: " + String.format("Your Sentence: %s", input));
        System.out.println("Compare with 'Hello': " + input.equals("Hello"));
        System.out.println("Compare with 'Hello' (Ignore Case): " + input.equalsIgnoreCase("Hello"));
        System.out.println("Index of 'o': " + input.indexOf('o'));
        System.out.println("Last Index of 'o': " + input.lastIndexOf('o'));
        System.out.println("====== End of Demo ======");

        in.close();
    }
}