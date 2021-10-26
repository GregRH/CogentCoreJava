import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cogent.emsjdbc.config.Config;
import com.cogent.emsjdbc.utils.BeanOne;
import com.cogent.emsjdbc.utils.BeanTwo;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		//DataSource dataSource = applicationContext.getBean("dataSource",DataSource.class);
		//EmployeeService service = applicationContext.getBean(EmployeeService.class);
		
		BeanTwo b2 = applicationContext.getBean(BeanTwo.class);
		b2.doSomthing();
		BeanOne b1 = applicationContext.getBean(BeanOne.class);
		b1.doSomthing();
		
		
		
		//System.out.println(dataSource.hashCode());
		//System.out.println(service.hashCode());
		//DataSource dataSource2 = applicationContext.getBean("dataSource",DataSource.class);
		//System.out.println(dataSource2.hashCode());
		
		//System.out.println(service.addEmployee(new Employee("a","a","a", new Date(), new Date(), 110)));
		
//		String id = "a";
//		System.out.println(service.isEmployeeExists(id) ? service.getEmployeeById(id): service.isEmployeeExists(id));
//	
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
