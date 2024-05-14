public class BowlerDemo {

	public static void main(String[] args)
	{
		Bowler b = new Bowler();
		b.bowlerDetails("Sachin", 10, 5, 750, 463);
		b.bowlingAvg();
		b.computeStrikeRate();
		b.showStatistics();
		
		Batter b1 = new Batter();
		b1.batterDetails("Sachin", 463, 18000);
		b1.getStatistics();
		b1.computeBattingAvg();
		
	}
}
