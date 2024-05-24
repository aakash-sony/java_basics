public class Utility extends Office 
{ 
	private double allowance;
	private double monthlyBonus;
	public Utility(String empName, double empSalary, String empDepartment, double allowance, double monthlyBonus) {
		super(empName, empSalary, empDepartment);
		this.allowance = allowance;
		this.monthlyBonus = monthlyBonus;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Allowance: "+allowance);
		System.out.println("Monthly Bonus: "+monthlyBonus);
	}

}
