import java.util.Date;
import java.util.List;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.service.EmployeeService;
import com.cogent.emsjdbc.service.EmployeeServiceImpl;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Employee e = new Employee("emp4","a","b",new Date(),new Date(),10.0f);
		//Employee e2 = new Employee("emp3","d","b",new Date(),new Date(),10.0f);
		EmployeeService service = EmployeeServiceImpl.getInstance();
		//System.out.println(service.addEmployee(e));
		//service.updateEmployee("emp1", e2);
		//System.out.println(service.isEmployeeExists("emp6"));
		//System.out.println(service.getEmployeeById("emp2").getEmpFirstName());
		//service.deleteAllEmployees();
		//service.deleteEmployeeById("emp4");
		List<Employee> employees = service.getEmployees();
		if(employees!=null) {
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
	}

}
