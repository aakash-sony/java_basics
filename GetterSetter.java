class Player
{
	private int playerId = 111;

	public int getPlayerId() 
	{
		return playerId;
	}

	public void setPlayerId(int playerId) 
	{
		this.playerId = playerId;
	}	
}

public class GetterSetter {

	public static void main(String[] args) 
	{
		Player p1 = new Player(); //1st object
		System.out.println(p1.getPlayerId()); ///111
		accept(p1);
		System.out.println(p1.getPlayerId()); ///111
	}

	public static void accept(Player p)  //p = p1
	{
		p = new Player(); //2nd object
		p.setPlayerId(999);
	}
}