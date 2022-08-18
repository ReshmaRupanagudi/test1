package java8features;

import java.util.Arrays;
import java.util.List;

public class Utils {
	
	public static List<Employee> getEmployess(){
		
		List<Employee> employees = Arrays.asList(   new Employee(1, "Sarojini", 90000.0,"inactive", new Department(101, "Singer")),
				new Employee(2, "Nageshwar rao", 100000.0,"inactive", new Department(102, "Actor")),
				new Employee(3, "NTR", 100000.0,"inactive", new Department(102, "Actor")),
				new Employee(4, "SPB", 110000.0, "inactive",new Department(101, "Singer")),
				new Employee(5, "Mohammad Rafi", 110000.0,"inactive", new Department(101, "Singer")),
				new Employee(6, "Shammi Kapoor", 110000.0,"inactive", new Department(102, "Actor")),
				new Employee(7, "SS Rajamouli", 110000.0,"active", new Department(103, "Director")),
				new Employee(8, "Mani Ratnam", 110000.0, "active",new Department(103, "Director")));
		return employees;
		
	}

	public static List<Transaction> getTransactions(){
		return Arrays.asList(new Transaction(9,1000.0, Transaction.GROCERY, new Currency("INR")),
				new Transaction(12,2000.0, Transaction.ELECTRONICS, new Currency("USD")), new Transaction(3,500.0, Transaction.GROCERY, new Currency("USD")),
				new Transaction(4,200000.0, Transaction.ELECTRONICS, new Currency("INR")), new Transaction(15, 500.0, Transaction.GROCERY, new Currency("EUR")));
		
	}
	
	public static List<Integer> getListOfNumbers() {
		return Arrays.asList(1,3,11,6,78,9);
		
	}
}



