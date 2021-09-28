package com.cogent.employeemanagementsystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fileOutStream;
		try {
			fileOutStream = new FileOutputStream("demo.txt");
			fileOutStream.write("abhi".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int division(int a,int b) {
		int c = 0;
		try {
			c=a/b;
			return c;
		} catch (ArithmeticException e) {
			
		}
		finally {
			System.out.println("after catch");
		}
		return -1;
	}
	
	/*public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the data");
		int c=0, b=0, a=0;
		/*try {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			System.out.println(a+"\n"+b);
			
		} catch (ArithmeticException e) {			
			e.printStackTrace();
			System.out.println("An exception occurred");
			System.out.println("Enter the value for b again");
			b=scanner.nextInt();
		}
		finally {
			c = a/b;
			System.out.println("Finally");
			scanner.close();
		}
		c=division(10, 2);
		System.out.println("division is "+c);*/
		/*String s = null;
		try {
			System.out.println(10/0);
			s.concat("s");
		}
		
		catch(ArithmeticException e) {
			
		}
		catch(NullPointerException e){
			System.out.println("Caught NPE");
		}
		catch (RuntimeException e) {
			// TODO: handle exception
		}
		catch(Exception e) {
			System.out.println("Exception caught");
			System.out.println(e.getClass().getName());
		}
		catch (Throwable e) {
			// TODO: handle exception
		}
	}*/

}
