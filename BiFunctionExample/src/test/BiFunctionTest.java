package test;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer>biFin=(a,b)->(a+b);
		System.out.println(biFin.apply(100, 200));

	}

}
