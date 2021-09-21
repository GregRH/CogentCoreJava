import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		final int Q_TICKET_COST=150;
		final int K_TICKET_COST=75;
		final int REFRESHMENT_COST=50;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of tickets");
		int num_tickets=input.nextInt();
		float total_cost=0;
		if(num_tickets>=5&&num_tickets<=40) {
			System.out.println("Do You want refreshment?");
			char refresh =input.next().charAt(0);
			System.out.println("Do You have coupon code");
			char coupon = input.next().charAt(0);
			System.out.println("Enter the circle");
			char circle=input.next().charAt(0);
			if(circle=='q') {
				total_cost=calculateTickets(Q_TICKET_COST,num_tickets,coupon);
				if(refresh=='y') {
					total_cost+=REFRESHMENT_COST*num_tickets;
				}
				System.out.println("Total Ticket Cost: "+total_cost);
			}
			else if(circle=='k') {
				total_cost=calculateTickets(K_TICKET_COST,num_tickets,coupon);
				if(refresh=='y') {
					total_cost+=REFRESHMENT_COST*num_tickets;
				}
				System.out.println("Total Ticket Cost: "+total_cost);
			}
			else
				System.out.println("Invalid input");
		}
		else
			System.out.println("Enter between minimum of 5 and maximum of 40");
	}
	public static float calculateTickets(int price, int num_tickets,char coupon) {
		float ret;
		ret=price*num_tickets;
		if(num_tickets>=20)
			ret-=ret*.10;
		if(coupon=='y')
			ret-=ret*.02;
		return roundHundredths(ret);
	}
	public static float roundHundredths(float f) {
		int temp = (int)(f*100);
		return (float)temp/100;
	}
}
