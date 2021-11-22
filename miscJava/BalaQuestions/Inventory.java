import java.util.HashMap;
import java.util.Map;
public class Inventory {

	static Map<Long, Product> products = new HashMap<Long, Product>();
	public static void main(String[] args) {
	//map of products with sku as key	
	

	}
	public static void recieve(long sku, int qty){
	}
	public static Product report(long sku){
		return products.get(sku); 
	}
	public static void sell(long sku, int qty){
	}
}

class Product {

	long sku;
	String name;
	int quantity;
	float price;
	public Product(long sku, String name, int quantity, float price) {
		this.sku = sku;
		this.name = name;
		this.quantity=quantity;
		this.price = price;
	}

	
}

