public class Technical extends Office 
{
     private double allowance;

	public Technical(String empName, double empSalary, String empDepartment, double allowance) {
		super(empName, empSalary, empDepartment);
		this.allowance = allowance;
	}
     
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Technical department Allowance: "+allowance);
	}
}
