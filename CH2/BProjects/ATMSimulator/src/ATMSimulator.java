// This program simulates an ATM machine, allowing users to check their balance, withdraw money, deposit money, and exit the program. The user is prompted to enter their PIN, and they have a maximum of 3 attempts to enter the correct PIN before their account is blocked. Once logged in, users can choose from a menu of options to perform various banking operations. The program uses a Scanner object to read user input and handles different cases based on the user's choices.
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // List of variables
        int PIN = 1234;
        int attempts = 0;
        int choice;
        double balance = 1000.0;
        double withdraw;
        double deposit;

        // Welcome message
        System.out.println("Welcome To Our Bank!!!");

        // PIN verification with a maximum of 3 attempts
        for (; attempts < 3; attempts++) {
            System.out.print("Please Enter Your PIN: ");
            int enteredPIN = in.nextInt();

            // If the entered PIN is correct, the user is granted access to the main menu. Otherwise, an error message is displayed and the user is prompted to try again.
            if (enteredPIN == PIN) {
                System.out.println("Your PIN is Correct");
                break;
            } else {
                System.out.println("Wrong PIN, Try again");
            }
        }
        // If the user fails to enter the correct PIN after 3 attempts, the account is blocked and the program ends
        if ( attempts == 3) {
            System.out.println("Account blocked. Too many wrong attempts.");
            return;
        }

        // Main menu loop
        do {
            // Display the menu options to the user
    System.out.println("""
            ========================
            1. Check Balance
            2. Withdraw
            3. Deposit
            4. Exit
            ========================
            """);
    System.out.print("Enter your choice: ");
    choice = in.nextInt();

    // Handle user choices
    switch (choice) {

        // case 1 is for checking balance, it simply shows the current balance
        case 1:
            System.out.println("========================");
            System.out.printf("Your Balance is $ %.0f %n " , balance);
            break;
            
            // case 2 is for withdrawal, it checks if the withdraw amount is greater than the balance. If it is, it shows an insufficient balance message. Otherwise, it deducts the withdraw amount from the balance and shows the updated balance.
        case 2:
            System.out.print("Type Your Withdraw Amount: ");
            withdraw = in.nextDouble();
            if (withdraw > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= withdraw;
                System.out.printf("Current Balance: $ %.2f%n", balance);
            }
            break;

            // case 3 is for deposit, it adds the deposit amount to the balance and shows the updated balance
        case 3: 
            System.out.println("========================");
            System.out.print("Type Your Deposit Number : ");
            deposit = in.nextDouble();
            balance += deposit;
            System.out.printf("Current Balance is : $ %.2f%n" , balance);
            break;

            // case 4 is for exit, it simply prints a goodbye message and breaks the loop to end the program
        case 4:  System.out.println("Goodbye!");
        // Exit the loop and end the program
            break;
        default: System.out.println("Invalid choice!");
    }
    // Loop continues until the user chooses to exit (choice 4)
} while (choice != 4);
    }
}