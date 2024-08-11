import java.util.Objects;

class EmployeeClass 
{
	private int employeeId;
	private String employeeName;

	public EmployeeClass(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "EmployeeClass [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}

}

              //Canonical Constructor
record EmployeeRecord(int employeeId, String employeeName) 
{
	//Compact constructor
	public EmployeeRecord
	{
		if(employeeId <= 0)
		{
			System.err.println("Invalid id");
		}
		
	}
}

public class MainRecord {

	public static void main(String[] args) 
	{
		//Comparison of class and record
		
		EmployeeClass e1 = new EmployeeClass(111, "Scott");
		System.out.println(e1);
		System.out.println(e1.getEmployeeName());
		EmployeeClass e2 = new EmployeeClass(111, "Scott");
		System.out.println(e1.equals(e2));
		
		System.out.println("................................");
		
		EmployeeRecord r1 = new EmployeeRecord(-222, "Smith");
		System.out.println(r1);
		System.out.println(r1.employeeName());
		EmployeeRecord r2 = new EmployeeRecord(222, "Smith");
		System.out.println(r1.equals(r2));
		
       		

	}

}
