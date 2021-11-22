public class ForName {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName(args[0]);
		Object o = c.newInstance();
		System.out.println(o.getClass().getName());
	}
	
}
