import java.util.Scanner;

public class StringCompressor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			try {
				String s1 = sc.next();
//				if(s1.equals("0"))
//					flag = false;
				String s2="";
				int count = 1;
				char current = s1.charAt(0);
				int i = 1;
				do {
					if(i<s1.length()&&s1.charAt(i)==current) {
						count++;
					}
					else {
						s2 = s2+current+count;
						count = 1;
						if(i<s1.length())
							current = s1.charAt(i);
						if(current == '0') throw new CustomException("Number Contains 0");
					}
				}while(++i<s1.length()+1);
				System.out.println(s2);
			}
			catch(CustomException e) {
				System.out.println("Invalid number");
			}
		}
	}
}
