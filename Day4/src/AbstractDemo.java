
public abstract class AbstractDemo {
	int a = 10;
	public AbstractDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Abstract Constructor");
	}
	public abstract void demo();
	public abstract void test();
	public void test2() {
		System.out.println("Test is called");
	}
	public static void display() {
		System.out.println("Display");
	}
	
	
}
