package com.nt.factory;

import com.nt.component.AmazonStore;
import com.nt.component.EcommerceStore;
import com.nt.proxy.EcommerceStoreDiscountProxy;

public class EcommerceStoreFactory {
	public static EcommerceStore getInstance(String couponCode) {
		if(couponCode.equalsIgnoreCase("")|| couponCode.trim().length()==0) {
			return new AmazonStore();
		}else {
			if(couponCode.equalsIgnoreCase("AM10"))
				return new EcommerceStoreDiscountProxy(10);
			else if(couponCode.equalsIgnoreCase("AM20"))
				return new EcommerceStoreDiscountProxy(20);
			else
				return new EcommerceStoreDiscountProxy(5);
		}
	}
	
	
}
