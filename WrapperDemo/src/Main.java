import java.lang.annotation.Annotation;

public class Main {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo.display();
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {

			@Override
			public void sample() {
				// TODO Auto-generated method stub
				System.out.println("Sample");
				
			}
			public String test() {
				return "Val";
			}
			
		};
		System.out.println(demo.test());
		FunctionalInterfaceDemo demo2= ()->{System.out.println("java 8");};
		demo2.sample();
//		TreeMap<Integer, String> hashMap = new TreeMap<>();
//		hashMap.put(10, "abhi");
//		hashMap.put(1, "abhinandan");
//		hashMap.put(3, null);
//		
//		
//		
//		System.out.println(hashMap);
//		System.out.println(hashMap.get(10));
//		
//		Set<Integer> set = hashMap.keySet();
//		System.out.println(set);
//		
//		Collection<String> values = hashMap.values();
//		System.out.println(values);
//		
//		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println(key);
//			System.out.println(val);
//			
//		}
		//		// autoboxing
//		Integer i = 10;
//		System.out.println(i.getClass().getName());
//		//unboxing
//		int a = i;
//		System.out.println(a);
//		
//		Float f = 10.0f;
//		System.out.println(f);
//		float b = f;
//		
//		double d = i.doubleValue();
		
		
	}

}
