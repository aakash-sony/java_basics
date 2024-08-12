import java.util.Optional;
class Employee
{
	private Integer empId;
	private String empName;
	
	public Employee() {}
	
	public Employee(Integer empId, String empName) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
	}

	//Changing the style of writing getter method
	public Optional<Integer> getEmpId() 
	{
		return Optional.ofNullable(empId);
	}

	public Optional<String> getEmpName() 
	{
		return Optional.ofNullable(empName);
	}	
}

public class OptionalDemo2 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(111,"Ravi");		
		//Employee emp = new Employee();
		
		Optional<Integer> empId = emp.getEmpId();
		if(empId.isPresent())
		{
			System.out.println(empId.get());
		}
		else
		{
			System.err.println("No id value ");
		}
		
		Optional<String> empName = emp.getEmpName();
		String name = empName.orElse("name is not available");
		System.out.println(name);
		         
	}
}