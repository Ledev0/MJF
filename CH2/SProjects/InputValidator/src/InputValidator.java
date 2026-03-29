import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x;
        System.out.println("Enter numbers (-1 to stop):");
        do {
            System.out.print("Enter a number: ");
            x = in.nextInt();
            if (x != -1)
                System.out.println("You entered: " + x);
        } while (x != -1);

        System.out.println("Stopped.");
    }
}