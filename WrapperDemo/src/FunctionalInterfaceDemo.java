
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	//Must have only one abstract method
	public void sample();
	
	//one abstract abstract methods + n default methods/static methods
	public static void display() {
		System.out.println("Display");
	}
	public default String test() {
		return "test";
	}
	
}
