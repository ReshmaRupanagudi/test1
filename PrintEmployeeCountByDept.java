package java8features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEmployeeCountByDept {

	public static void main(String[] args) {
		List<Employee> employees = Utils.getEmployess();
		
		Map<Integer, List<Employee>> employeesByDept= employees.stream().
				collect(Collectors.groupingBy(t -> t.getDept().getDeptId() ,Collectors.toList()));
		
		employeesByDept.entrySet().forEach(entry -> {
			System.out.println("Key:  "+entry.getKey());
			System.out.println("Value:"+entry.getValue());
		});
	}
	

	

}
