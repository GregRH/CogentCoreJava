import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the car no:");
		int carNumber = input.nextInt();
		if (carNumber >= 1000 && carNumber <= 9999) {
			int sum = sum(carNumber);
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky number");
			}else
				System.out.println(carNumber+"is not a valid car number");
		}else
			System.out.println(carNumber+"is not a valid car number");
	}

	public static int sum(int carNumber) {
		int sum = 0;
		while (carNumber > 0) {
			sum += carNumber % 10;
			carNumber /= 10;
		}
		return sum;
	}
}
