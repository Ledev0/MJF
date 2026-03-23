import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to Student Report Card");

        System.out.print("Please Type Your Name : ");
        String name = in.next();

        System.out.print("Please Type Your Age : ");
        int age = in.nextInt();

        System.out.println("===========================");

        // The Grades of Subjects
        System.out.println("Note : The Maximum Degree is 100 , Minimum is 50");

        System.out.print("Please Type Your Math Degree : ");
        double math = in.nextDouble();

        System.out.print("Please Type Your Science Degree : ");
        double sci = in.nextDouble();

        System.out.print("Please Type Your English Degree : ");
        double en = in.nextDouble();

        System.out.print("Please Type Your History Degree : ");
        double hist = in.nextDouble();

        System.out.print("Please Type Your Geography Degree : ");
        double geo = in.nextDouble();

        System.out.println("===========================");

        // The Final Degree
        System.out.println("Note : All Degrees were added together, then divided by 500, and then multiplied by 100 to give the percentage.");
        double Final = ((math + sci + en + hist + geo) / 500) * 100;

        // The Report Card
        System.out.println("===========================");
        System.out.println("    Student Report Card    ");
        System.out.println("===========================");
        System.out.println("Your Name is : " + name);
        System.out.println("Your Age is : " + age);
        System.out.println("===========================");
        System.out.println("Your Subjects Degrees : \uD83D\uDC47\uD83C\uDFFC");
        System.out.println("Math Degree = " + math);
        System.out.println("Science Degree = " + sci);
        System.out.println("English Degree = " + en);
        System.out.println("History Degree = " + hist);
        System.out.println("Geography Degree = " + geo);
        System.out.println("===========================");
        System.out.println("Your Final Degree is : " + Final);
        // The Grade Scale
        if (Final >= 95) {
            System.out.println("You Got A+");
        }
        else if (Final >= 90) {
            System.out.println("You Got A");
        }
        else if (Final >= 85) {
            System.out.println("You Got B+");
        }
        else if (Final >= 80) {
            System.out.println("You Got B");
        }
        else if (Final >= 75) {
            System.out.println("You Got C+");
        }
        else if (Final >= 70) {
            System.out.println("You Got C");
        }
        else if (Final >= 65) {
            System.out.println("You Got D+");
        }
        else if (Final >= 60) {
            System.out.println("You Got D");
        }
        else if (Final >= 55) {
            System.out.println("You Got D-");
        }
        else if (Final >= 50) {
            System.out.println("You Got E");
        }
        else {
            System.out.println("You Failed , Hard Luck");
        }
    }
}