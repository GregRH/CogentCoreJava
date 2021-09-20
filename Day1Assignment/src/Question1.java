import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		int fuel=20;
		int distance =150;
		float lpk;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		fuel=input.nextInt();
		if(fuel<=0) {
			System.out.println(fuel+" is an invalid input");
		}
		else {
			System.out.println("Enter the distance covered");
			distance=input.nextInt();
			if(distance<=0)
				System.out.println(distance+" is an invalid input");
			else {
				lpk = fuel/(distance/(float)100);
				System.out.println("Liters/100KM\n"+roundHundredths(lpk));
				System.out.println("Miles/gallons\n"+roundHundredths(toMPG(fuel,distance)));
			}
		}
		
	}
	public static float toMPG(int fuel, int distance) {
		return (distance*(float)0.6214)/(fuel*(float)0.2642);
	}
	public static float roundHundredths(float f) {
		int temp = (int)(f*100);
		return (float)temp/100;
		
	}
}
