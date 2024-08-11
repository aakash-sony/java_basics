public class Employee1
{
	private String employeeName;
	private int employeeNumber;
	private double employeeSalary;
	
	public Employee1(String employeeName, int employeeNumber, double employeeSalary)
	{
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
