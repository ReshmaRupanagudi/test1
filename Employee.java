package java8features;

public class Employee {
	
	public Employee(int id, String name, double salary, String status,Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.status = status;
		this.dept = dept;
	}
	private int id;
	private String name;
	private double salary;
	private Department dept;
	private String status;
	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", status=" + status +", dept=" + dept + "]";
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
