/*
* WAP which accept the input of political parties(name, symbol);
* Candidate can file the nomination for any political party or independent;
* feed the data to the system about consituency its id and no of votes, remember any number of candidate can file nomination 
   in a consituency;
*  Now feed the system no of votes, particular candidate, achieved in every consituency;
* Once this is done so the winner in every consituency and the series of other candidate with the number of votes and 
  voting percentage. Apart from this show the winner and the second largest party.
*/
    
class PoliticalParties
{
	private String partyName;
	private String partySymbol;
	
	public PoliticalParties(String partyName, String partySymbol)
	{
		this.partyName = partyName;
		this.partySymbol = partySymbol;
	}
	
	public String getPartyName()
	{
		return partyName;
	}
	
	public void setPartyName(String partyName)
	{
		this.partyName = partyName;
	}
	
	public String getPartySymbol()
	{
		return partySymbol;
	}
	
	public void setPartySymbol(String partySymbol)
	{
		this.partySymbol = partySymbol;
	}

	void partyDetails()
	{
		System.out.println("Party Name: "+partyName);
		System.out.println("Party Symbol: "+partySymbol);
	}
}