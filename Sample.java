package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(1,3,5,7,8,2);
		List<Integer> evenSquares = 
				numbers.stream().filter( i-> i%2==0 ).map(n -> n*n).collect(Collectors.toList());
		System.out.println(evenSquares);
		List<Employee> emp = Utils.getEmployess();
		Collections.sort(emp, Comparator.comparing(Employee::getName).thenComparingDouble(Employee::getSalary));
	System.out.println(emp);
	

	
	}
	
	

}
