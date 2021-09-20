import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		//There was no error handling in the problem description
		final int pizza_cost=100;
		final int puffs_cost=20;
		final int cooldrink_cost=10;
		int pizza,puffs,cooldrink;
		
		Scanner input = new Scanner(System.in);
		int bill=0;
		System.out.print("Enter The no of pizzas bought: ");
		pizza=input.nextInt();
		bill+=pizza*pizza_cost;
		System.out.print("Enter The no of puffs bought: ");
		puffs=input.nextInt();
		bill+=puffs*puffs_cost;
		System.out.print("Enter The no of cooldrink bought: ");
		cooldrink=input.nextInt();
		bill+=cooldrink*cooldrink_cost;
		System.out.println("Bill Details\nNo of pizzas:"+pizza+
				"\nNo of puffs:"+puffs+
				"\nNo of cooldrinks:"+cooldrink+
				"\nTotal price="+bill+
				"\nENJOY THE SHOW");
	}
}
