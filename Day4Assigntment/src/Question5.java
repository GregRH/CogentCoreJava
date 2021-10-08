import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		UnaryOperator<Integer> cube = ua->ua*ua*ua;
		UnaryOperator<Integer> square = ua->ua*ua;
		BinaryOperator<Integer> equation = (ea,eb)->cube.apply(ea)
				+square.apply(ea)*eb
				+2*square.apply(ea)*eb
				+2*ea*square.apply(eb)
				+ea*square.apply(eb)
				+cube.apply(eb);
		c = equation.apply(a, b);
		System.out.println(c);
	}

}
