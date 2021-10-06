import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("spring","java","angular","microservices");
		getList(list,"java").forEach(System.out::println);
		
	}
	
	public static List<String> getList(List<String> list, String filter){
//		List<String> result = new ArrayList<>();
//		for (String string : list) {
//			if(!string.equals(filter)) {
//				result.add(string);
//			}
//		}	
		return list.stream().filter(e->!e.equals(filter)).collect(Collectors.toList());
	}

}
