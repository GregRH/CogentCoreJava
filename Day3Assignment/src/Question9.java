import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = input.nextInt();
		System.out.println("Enter the performance appraisel rating");
		float appraisel = input.nextFloat();
		if (salary >= 0) {
			if (appraisel > 5)
				System.out.println("Invalid input");
			else if (appraisel > 4) {
				salary += salary * 0.30;
				System.out.println(salary);
			} else if (appraisel > 3) {
				salary += salary * 0.20;
				System.out.println(salary);
			} else if (appraisel >= 1) {
				salary += salary * 0.10;
				System.out.println(salary);
			} else
				System.out.println("Invalid Input");
		}
		else
			System.out.println("Invalid Input");
	}
}
