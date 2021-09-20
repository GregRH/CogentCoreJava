import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int cse,ece,mech;
		String names[]= {"CSE","ECE","MECH"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students placed in CSE");
		cse = input.nextInt();
		System.out.println("Enter the number of students placed in ECE");
		ece=input.nextInt();
		System.out.println("Enter the number of students placed in MECH");
		mech=input.nextInt();
		if(cse<0||ece<0||mech<0)
			System.out.println("Input is invalid");
		else if(cse==ece&&cse==mech) {
			System.out.println("None of the departments has got the highest placement");
		}
		else
		{
			int all[]={cse,ece,mech};
			int pos[]= {0,-1};
			for(int i=0;i<all.length;i++) {
				if(all[i]>all[pos[0]]) {
					pos[0]=i;
				}
				else if(all[i]==all[pos[0]]) {
					pos[1]=i;
				}
			}
			if(pos[0]>=pos[1]) {
				System.out.println("Highest placement\n"+names[pos[0]]);
			}
			else
				System.out.println("Highest placement\n"+names[pos[0]]+"\n"+ names[pos[1]]);
		}
	
	}
}
