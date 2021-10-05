package test;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>function1=(a)->(a+25);
		System.out.println(function1.apply(100));
		
	}

}
