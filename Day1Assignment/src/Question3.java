import java.util.Scanner;

public class Question3 {
	//No error handling
	public static void main(String[] args) {
		int nums[]=new int[4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the digits:");
		for(int i=0;i<nums.length;i++)
			nums[i]=input.nextInt();
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]+"-"+(char)nums[i]);
		}
	}
}
