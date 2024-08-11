public class Production extends Office 
{
    private double allowance;
    private double monthlyIncentive;
	public Production(String empName, double empSalary, String empDepartment, double allowance,
			double monthlyIncentive) {
		super(empName, empSalary, empDepartment);
		this.allowance = allowance;
		this.monthlyIncentive = monthlyIncentive;
	}
    
    public void displayInfo()
    {
    	super.displayInfo();
    	System.out.println("Allowance: "+allowance);
    	System.out.println("Monthly Incentive : "+monthlyIncentive);
    }
}
    
