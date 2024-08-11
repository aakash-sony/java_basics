record Employee(int empId, String empName, double empSalary)
{
	
}

public class Supplier4 
{
	public static void main(String[] args)
	{
		Supplier<Employee> s2 = ()->
		{
			Employee e1 = new Employee(1, "A", 23567);
			return e1;
		};
		
		Employee emp = s2.get();
		System.out.println(emp);
	}

}