import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.next();
		String reverse =reverseString(input) ;
		//System.out.println(reverse);
		if(reverse.equals(input))
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}	
	public static String reverseString(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		return reverse;
	}
}
