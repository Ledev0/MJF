import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x;
        System.out.println("Welcome to The Guess Game");

        do {
            System.out.println("Enter Your Guessing Number");
            x = in.nextInt();
        } while (x != 16);
            System.out.println("Congratulations You Win The Game");

    }
}