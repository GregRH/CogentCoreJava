import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduceMain {

	public static void main(String[] args) {
//		 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		  int sum = 0;
//		  for (int i : numbers) {
//		      sum += i;
//		  }
//		  System.out.println("sum : " + sum);
//		  int sum1 = Arrays.stream(numbers).reduce(0, Integer::min);//(a,b)->a+b
//		  System.out.println(sum1);
//		  IntStream stream=Arrays.stream(numbers);
//		  Stream<Integer> boxed = stream.boxed();
//		  boxed.forEach(System.out::println);
		  List<String> list = Arrays.asList("9","A","Z","1","B","Y","4","a","c");
		  String str[] = {"9","A","Z","1","B","Y","4","a","c"};
		  List<String> list2=Arrays.asList(str);
//		  for(int i =0;i<list.size();i++) {
//			  for(int j = i;j<list.size();j++)
//			  if(list.get(i).compareTo(list.get(j))>0) {
//				  String s = list.get(i);
//				  list.set(i, list.get(j));
//				  list.set(j, s);
//			  }
//		  }
		 // Arrays.sort(str);
		  //Arrays.asList(str).forEach(System.out::println);
		//  System.out.println(list);
		 // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		  List<String> sorted = list2.stream().sorted().collect(Collectors.toList());
		  sorted.forEach(System.out::println);
	}

}
