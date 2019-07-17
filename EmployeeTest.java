import java.io.*;
public class EmployeeTest {

	public static void main(String args[]) {
		Employee empOne = new Employee("Mahmud Siraj");
		Employee empTwo = new Employee("James Smith");

		empOne.empAge(26);
		empOne.empSalary(10000);
		empOne.empDesignation("Senior Analyst");
		empOne.printEmployee();

		empTwo.empAge(26);
                empTwo.empSalary(10000);
                empTwo.empDesignation("Analyst");
		empTwo.printEmployee();
	}
}
