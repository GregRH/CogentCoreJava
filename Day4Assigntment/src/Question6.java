import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in );
		Pattern p = Pattern.compile("^[0-9]+\\s[0-9]$");
		int numDealerships = 3;
		List<StringBuffer> dealersin = new ArrayList<>();
		for(int i = 0;i<numDealerships;i++) {
			StringBuffer in = new StringBuffer(input.nextLine());
			if(p.matcher(in.toString()).find())
				dealersin.add(in);
			else {
				System.out.println("invalid format try again");
				i--;
			}
		}
		int dealer = 1;
		for (StringBuffer stringBuffer : dealersin) {
			int cars = Integer.parseInt(stringBuffer.toString().split(" ")[0]);
			int bike = Integer.parseInt(stringBuffer.toString().split(" ")[1]);
			System.out.println("dealership"+dealer + " has " + (cars*4+bike*2) +" tires");
			dealer++;
		}
	}

}
