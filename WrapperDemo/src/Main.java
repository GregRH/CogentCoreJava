import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class Main {
	public static <T> List<T> math(List<T> list,UnaryOperator<T> unaryOperator){
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(unaryOperator.apply(t));
		}
		return result;
	}
	public static <T> List<T> mathB(List<T> list,List<T> list2,BinaryOperator<T> binaryOperator){
		List<T> result = new ArrayList<>();
		int i =0;
		for (T t : list) {
			result.add(binaryOperator.apply(t,list2.get(i++)));
		}
		return result;
	}
	public static <T> List<T> mathC(List<T> list,T init,BinaryOperator<T> binaryOperator){
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(binaryOperator.apply(t,init));
		}
		return result;
	}
	public static <T> T mathD(List<T> list,T init,BinaryOperator<T> binaryOperator){
		T result = init;
		for (T t : list) {
			result=(binaryOperator.apply(t,result));
		}
		return result;
	}
	public static<T> Supplier<List<T>> supplier() {
		return ()->new ArrayList<T>();
	}
	public static void main(String[] args) {
		//BiFunction<Integer, Integer, Integer> biFunction = (a,b)->{return a+b;};
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer[] num = {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer> predicateGreatertThan = x->x>3;
		Predicate<Integer> predicate = x->x%2==0;
		List<Integer> result =Arrays.asList(num).stream().filter(predicateGreatertThan.negate().and(predicate.negate())).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		Supplier<List<Integer>> a = supplier();
		List<Integer> b = a.get();
		Supplier<List<Float>> f = supplier();
		System.out.println(b);
		
		
		
		
		
		
		
//		BinaryOperator<Integer> biop = (a,b)->{return a+b;};
//		int result = biop.apply(10, 20);
//		System.out.println(mathB(list,list,biop));
//		System.out.println(mathC(list,10,biop));
//		System.out.println(mathD(list, 0,Integer::sum));
//		Function<Integer,Integer> f =x->x*2;
//		UnaryOperator<Integer> u = x->x*2;
//		
//		//int result = f.andThen(f).andThen(u).apply(10);
//		System.out.println(math(list,u));
////		System.out.println("AFG".toLowerCase());
//		List<String> l = Arrays.asList("SSS","FFFFF","ASFD");
//		l.stream().map(String::toLowerCase).forEach(System.out::println);
	}}
	
//	public static <T,R> List<R> map(List<T> list, Function<T,R> func){
//		List<R> result = new ArrayList<>();
//		for (T t : list) {
//			result.add(func.apply(t));
//		}
//		return result;
//	}
//	public static String sha256(String str) {
//		return DigestUtils.sha256Hex(str);
//		
//	}
//	public static String sha512(String str){
//	return DigestUtils.sha512Hex(str);
//	}
//	public static String sha384(String str){
//		
//		return DigestUtils.sha384Hex(str);
//	}
//		
//	private static double sum(List <? extends Number>list) {
//		double result = 0;
//		for (Number number : list) {
//			result += number.doubleValue();
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		List<Integer> intList = Arrays.asList(1,3,4,5,6);
//		List<Integer> intlist2 = map(intList,i->i*2);
//		System.out.println(intlist2);
//		List<String> list = Arrays.asList("abhi","test","result");
//		List<String> list2 = map(list,x->sha256(x));
//		System.out.println(list2);
//		System.out.println(map(list,x->sha512(x)));
//		System.out.println(map(list, x->sha384(x)));
		//		List<Double> doubleList = Arrays.asList(1.0,2.0,3.0);
//		
//		System.out.println(sum(intList)+"\n"+sum(doubleList));
//		
//		Function<String, Integer> function = x->x.length();
//		Function<Integer,Integer> function2 = x->x*2;
//		Integer result = function.andThen(function2).apply("abhinandan");
//		Integer result2 = function.andThen((Integer x)->x*2).apply("abhin");
//		System.out.println(result);
//		System.out.println(result2);
//		Number num = new Integer(10);
//		List<? super Number> numbers = new ArrayList<Number>();
		//List<? super A> list is typed to either class A or a super class of A
		//Lower bound wildcard character
		//extends A: a list of objects that are instances of class A or subclass of A
		//upper bound wildcard character
//		numbers.add(10);
//		numbers.add(10.5);
//		System.out.println(numbers);
		//int a = function.apply("asdasf");
		//int b = function.apply("1");
		//System.out.println(a);
		//System.out.println(b);
//		FunctionalInterfaceDemo.display();
//		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {
//
//			@Override
//			public void sample() {
//				// TODO Auto-generated method stub
//				System.out.println("Sample");
//				
//			}
//			public String test() {
//				return "Val";
//			}
//			
//		};
//		System.out.println(demo.test());
//		FunctionalInterfaceDemo demo2= ()->{System.out.println("java 8");};
//		demo2.sample();
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
		
		
	//}

//}
