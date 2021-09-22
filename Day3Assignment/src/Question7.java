import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		a=input.nextInt();
		System.out.println("");
		b=input.nextInt();
		if(a<b&&a>0)
			for (int i = a; i <= b; i++) {
				boolean prime=true;
				for(int j =2;j<i;j++) {
					if(i%j==0)
						prime=false;
				}
				if(prime)
					System.out.print(i+" ");
			}
		else
			System.out.println("Provide valid input");
	}
}
