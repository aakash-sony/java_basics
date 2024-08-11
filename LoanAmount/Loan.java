public class Loan
{
	 private double principle;
	 private double interestRate;
	 private int durationMonths;
	 
	  public Loan(double principle, double interestRate, int durationMonths)
	  {
		super();
		this.principle = principle;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
	  }
	  
	  
	 public double getPrinciple() 
	 {
		return principle;
	 }

	public double getInterestRate() {
		
		return interestRate;
	}

    public int getDurationMonths()
    {
		return durationMonths;
	}

	public double calculateMonthlyPayment()
	
	  {
		if(principle > 0 && interestRate > 0 && durationMonths > 0)
		{
			double totalInterest = (interestRate * durationMonths * principle)/(100*12);
		    double totalPayment = (principle + totalInterest);
		    double monthlyPayment = totalPayment/durationMonths;
		      return monthlyPayment;
		}
		else
		{
			System.out.println("Don't Enter negative or zero value.");
			return 0.0;
		}
	  }
	 
	  
}
