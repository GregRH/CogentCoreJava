package com.cogent.employeemanagementsystem;

public class Main3 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		buffer.delete(0, 5);
		System.out.println(buffer);
		
		/*//DC default 16 characters
		buffer.append("abhinandan");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		buffer.append("advik");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		buffer.append(" ");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		buffer.append(" ");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());*/
		
		
		
		
		
		/*String s = "cogent university";
		
		String result = s.substring(0,6);//Substring is [a,b)
		System.out.println(s== new String("cogent university"));
		
		System.out.println("abi".codePointAt(0));
		System.out.println("ABI".codePointAt(0));
		System.out.println("abi".compareTo("ABI"));
		*/
		
		
		
		
		/*/// ip: 192.168.1.1
		String ip = "192.168.1.1";
		// split on the .
		String[] ipAddress = ip.split("\\.");
		for (String string : ipAddress) {
			System.out.println(Integer.parseInt(string));
			int a = Integer.parseInt(ipAddress[0]);
			if (a > 0 && a < 256)
				System.out.println("valid");
			else
				System.out.println("Not valid");
		}
		int classCell=0;
		try {
			classCell = Integer.parseInt(ipAddress[0]);
			if (classCell > 0 && classCell >= 127) {
				System.out.println("Class A");
			} else if (classCell > 127 && classCell <= 191)
				System.out.println("Class B");
			else if (classCell > 191 && classCell <= 223)
				System.out.println("Class C");
			else if (classCell > 223 && classCell <= 239)
				System.out.println("Class D");
			else if (classCell > 239 && classCell <= 255)
				System.out.println("Class E");
		} catch (NumberFormatException e) {
		}*/
	}

}
