public class EmployeeDemo 
{

	public static void main(String[] args)
	{
		Employee1 sc = new Employee1("akash",12,98000);
		sc.setEmployeeNumber(14);
		System.out.println(sc);
		
		double sal = sc.getEmployeeSalary();
		if(sal > 90000)
		{
			System.out.println("You are a Developer.");
		}
		else if(sal > 60000)
		{
			System.out.println("You are a Designer.");
		}
		else
		{
			System.out.println("You are a Tester.");
		}
	}

}
