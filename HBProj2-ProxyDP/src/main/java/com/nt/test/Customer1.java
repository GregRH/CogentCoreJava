package com.nt.test;

import com.nt.component.EcommerceStore;
import com.nt.factory.EcommerceStoreFactory;

public class Customer1 {
public static void main(String[] args) {
	EcommerceStore store = null;
	store=EcommerceStoreFactory.getInstance("AM20");
	 System.out.println(store.getClass());
	 System.out.println("Bill Amount"+store.shopping(new String[] {"rakhi","sweets"}, new double[] {4000,3000}));
}
}
