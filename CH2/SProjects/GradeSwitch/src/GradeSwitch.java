import java.util.Scanner;

public class GradeSwitch {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("Enter Your Grade : ");
	double studentGrade = in.nextDouble();
	
	int scaleGrade = (int)(studentGrade / 10);
	
	switch(scaleGrade) {
	case 10:
	case 9:
		System.out.println("You Got A");
		break;
	case 8:
		System.out.println("You Got B");
		break;
	case 7:
		System.out.println("You Got C");
		break;
	case 6:
		System.out.println("You Got D");
		break;
	case 5:
		System.out.println("You Got D-");
		break;
	default:
		System.out.println("You Failed");
		}
	}
}

