package com.nt.proxy;

import com.nt.component.AmazonStore;
import com.nt.component.EcommerceStore;

public class EcommerceStoreDiscountProxy implements EcommerceStore{
	private EcommerceStore real;
	private float discount;
	
	public EcommerceStoreDiscountProxy(float discount) {
		this.discount=discount;
		real=new AmazonStore();
	}
	
	@Override
	public double shopping(String[] items, double[] prices) {
		double billAmt=0.0f;
		double finalAmt=0.0f;
		billAmt=real.shopping(items, prices);
		finalAmt=billAmt-(billAmt*discount/100);
		return finalAmt;
	}

}
