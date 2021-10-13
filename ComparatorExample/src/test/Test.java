package test;

import java.util.ArrayList;
import java.util.Collections;

import org.NameComparator;
import org.PriceComparator;
import org.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1001, "Mobile", 45000));
		prodList.add(new Product(1001, "TV", 95000));
		prodList.add(new Product(1001, "Oven", 22000));
		prodList.add(new Product(1001, "Tripod", 7000));
		System.out.println("----Sorting by name----");
		Collections.sort(prodList,new NameComparator());
		//Collections.sort(prodList,(o1,o2)-> o1.price<o2.price ? 1:o1.price==o2.price ? 0:-1);
		for (Product prod : prodList) {
			System.out.println(prod.prodId + " " + prod.name + " " + prod.price);}
		System.out.println("----Sorting by price----");
		Collections.sort(prodList,new PriceComparator());
		for (Product prod : prodList) {
			System.out.println(prod.prodId + " " + prod.name + " " + prod.price);}
	}

}
