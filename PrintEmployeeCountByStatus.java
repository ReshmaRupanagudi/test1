package java8features;

import java.util.List;
import java.util.stream.Collectors;

public class PrintEmployeeCountByStatus {
	
	public static void main(String[] args) {
		List<Employee> employees = Utils.getEmployess();
		
		List<String> employeesByactiveStatus=employees.stream().filter(p -> p.getStatus().equals("active")).map(p-> p.getName()).collect(Collectors.toList());

		Long activeCount = employees.stream().filter(p -> p.getStatus().equals("active")).count();
		System.out.println("Active Count : " +activeCount);
		employeesByactiveStatus.forEach(s -> System.out.println(s) );
	}
	

}
