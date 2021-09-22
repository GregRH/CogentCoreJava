import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month:\n");
		int in = input.nextInt();
		if(in>=1&&in<=12) {
			switch(in){
			case 1: case 2:case 12:
				System.out.println("Winter");
				break;
			case 3:case 4: case 5:
				System.out.println("Spring");
				break;
			case 6:case 7: case 8:
				System.out.println("Summer");
				break;
			case 9: case 10: case 11:
				System.out.println("Autumn");
				break;
			}
			
		}
		else
			System.out.println("invalid month");
	}

}
