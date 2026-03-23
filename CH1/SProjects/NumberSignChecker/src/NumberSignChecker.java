import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String result = num > 0 ? "Positive" : (num < 0 ? "Negative" : "Zero");
        System.out.println(num + " is " + result);
    }
}