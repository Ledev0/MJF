import java.util.Scanner;

public class FormattedUserProfile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = in.next();
        System.out.print("Enter Your Age : ");
        int age = in.nextInt();
        System.out.print("Enter Your Height : ");
        float height = in.nextFloat();
        System.out.printf("Your name is %s , Your age is %d and Your height is %.1f", name, age, height);
    }
}