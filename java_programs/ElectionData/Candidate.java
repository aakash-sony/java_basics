class Candidate extends PoliticalParties
{
	private String condidateName;
	private int condidateAge;

	public Candidate(String partyName, String partySymbol, String condidateName, int condidateAge)
	{
		super(partyName, partySymbol);
		this.condidateName = condidateName;
		this.condidateAge = condidateAge;
	}

	public String getcondidateName()
	{
		return condidateName;
	}
	
	public void setCondidateName(String condidateName)
	{
	   this.condidateName = condidateName;
	}
	
	public int getCondidateAge()
	{
		return condidateAge;
	}
	
	public void setCondidateAge(int condidateAge)
	{
	   this.condidateAge = condidateAge;
	}
	
}