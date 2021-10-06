import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list2 = Arrays.asList(new Employee(0,"bill"),new Employee(1,"Steve"),new Employee(2,"Red")
				,new Employee(3,"Ar"),new Employee(4,"Bill2"));
		
		//getList(list2, new Employee(1,"Steve")).forEach(System.out::println);
		System.out.println(getEmployeeByName(list2, "Ar",3));
		
	}
	public static Employee getEmployeeByName(List<Employee> list, String name, int id) {
//		for (Employee employee : list) {
//			if(employee.name.equals(Name))
//				return employee;
//		}return null;
		return list.stream()
				.filter(e->e.getName().equals(name)&&id==e.getEmpNo()).findAny().orElse(null);
	}
	
	
	
	public static <T> List<T> getList(List<T> list, T filter){
		return list.stream().filter(e->!e.equals(filter)).collect(Collectors.toList());
	}
}
