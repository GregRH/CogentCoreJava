package com.nt.component;

import java.util.stream.DoubleStream;

public class AmazonStore implements EcommerceStore {

	public double shopping(String[] items, double[] prices) {
		double billAmt=0.0;
		billAmt=DoubleStream.of(prices).sum();
		return billAmt;
	}

}
