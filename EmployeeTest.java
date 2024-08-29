public class EmployeeTest {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("John Doe", 12, "123456", 50000);

        // Create an instance of Manager
        Manager manager = new Manager("Jane Smith", 12, "Sales", 10000, 5.5);

        // Display the information of both the employee and the manager
        System.out.println("Employee Information:");
        System.out.println(employee.toString());
        System.out.println();

        System.out.println("Manager Information:");
        System.out.println(manager.toString());
        System.out.println();

        // Raise the salary of both the employee and the manager by 10%
        employee.raiseSalary(10);
        manager.raiseSalary(10);

        // Display the updated information of both
        System.out.println("Updated Employee Information:");
        System.out.println(employee.toString());
        System.out.println();

        System.out.println("Updated Manager Information:");
        System.out.println(manager.toString());
    }
}
