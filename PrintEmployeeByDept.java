package java8features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEmployeeByDept {

	
	public static void main(String[] args) {
		List<Employee> employees = Utils.getEmployess();
		
		
		Map<String, Long> countOfEmployeesByDept= employees.stream().
				collect(Collectors.groupingBy(t -> t.getDept().getDeptName() ,Collectors.counting()));
		System.out.println(countOfEmployeesByDept);
		
		countOfEmployeesByDept.entrySet().forEach(entry -> {
			System.out.println("Key:  "+entry.getKey());
			System.out.println("Value:"+entry.getValue());
		});
	}
	
	
}
