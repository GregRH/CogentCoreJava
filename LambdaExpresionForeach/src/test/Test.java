package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>cart=new ArrayList<String>();
		cart.add("Mobile");
		cart.add("TV");
		cart.add("Guitar");
		cart.add("Book");
		cart.forEach((n)->System.out.println(n))
		;

	}

}
