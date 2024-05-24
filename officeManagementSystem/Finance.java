public class Finance extends Office 
{
	private double allowance;
	private double targetAchievement;
	public Finance(String empName, double empSalary, String empDepartment, double allowance, double targetAchievement)
	{
		super(empName, empSalary, empDepartment);
		this.allowance = allowance;
		this.targetAchievement = targetAchievement;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Allowance: "+allowance);
		System.out.println("Target Achievement Incentive: "+targetAchievement);
	}
}
