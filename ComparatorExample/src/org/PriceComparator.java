package org;

import java.util.Comparator;

public class PriceComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product)o2;
		if(p1.price==p2.price)
			return 0;
		else if(p1.price>p2.price)
			return 1;
		else
			return -1;
		
	}

}
