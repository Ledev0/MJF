import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your grade : ");
        int g = in.nextInt();
        if (g >= 91 && g <= 100) {
            System.out.print("Your Grade is A");
        } else if (g >= 81 && g <= 90) {
            System.out.print("Your Grade is B");
        } else if (g >= 71 && g <= 80) {
            System.out.print("Your Grade is C");
        } else if (g >= 61 && g <= 70) {
            System.out.print("Your Grade is D");
        } else if (g >= 50 && g <= 60) {
            System.out.print("Your Grade is F");
        } else if (g < 50) {
            System.out.print("Your Fail");
        } else {
            System.out.print("Invalid value");
        }

    }
}