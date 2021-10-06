package test;

import java.util.ArrayList;
import java.util.Collections;

import org.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1001, "Mobile", 45000));
		prodList.add(new Product(1001, "TV", 95000));
		prodList.add(new Product(1001, "Oven", 22000));
		prodList.add(new Product(1001, "Tripod", 7000));
		Collections.sort(prodList);
		for (Product prod : prodList) {
			System.out.println(prod.prodId + " " + prod.name + " " + prod.price);
		}
	}

}
