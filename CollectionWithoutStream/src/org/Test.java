package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1001, "TV", 95000, 1, "Apple", 0));
		prodList.add(new Product(1002, "Tripod", 7000, 2, "Digitech", 100));
		prodList.add(new Product(1003, "CCTV Camera", 4500, 5, "Mi", 150));
		prodList.add(new Product(1004, "Mobile", 50000, 1, "Samsung", 0));
		prodList.add(new Product(1005, "Monitor", 16000, 4, "Dell", 100));
		prodList.add(new Product(1006, "Mouse", 1200, 15, "logitech", 50));
		List<String> freeDeliveryProducts = new ArrayList<String>(); // find out product with free delivery
		for (Product prod : prodList) {
			if (prod.deliveryCharges == 0.0) {
				freeDeliveryProducts.add(prod.name);
			}
		}
		System.out.println(freeDeliveryProducts);
	}

}
