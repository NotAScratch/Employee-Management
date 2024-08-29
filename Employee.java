
public class Employee {
	// Private attributes
	private String name;
	private int age;
	private String department;
	private double salary;

	// Constructor
	public Employee(String name, int age, String department, double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	
	// Getter and Setter methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Method to raise salary by a given percentage
	public void raiseSalary(double percentage) {
		if (percentage > 0) {
			this.salary += this.salary * percentage / 100;
		}
	}
	
	// Method to display employee information
	public void displayEmployeeInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
}
