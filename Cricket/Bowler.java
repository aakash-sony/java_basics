public class Bowler 
{
         private String name;
	 private int wickets;
	 private int matches;
	 private int balls_bowled;
	 private int runs_conceded;
	 
	 public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded)
	 {
		 this.name = name;
		 this.wickets = wickets;
		 this.matches = matches;
		 this.balls_bowled = balls_bowled;
		 this.runs_conceded = runs_conceded;
	 }
	 
	 public void bowlingAvg()
	 {
		 if(wickets > 0 && runs_conceded > 0 && matches > 0 && balls_bowled > 0)
		 {
		   float bowling_Avg = (float)runs_conceded / wickets;
		   System.out.println("Name: "+name);
		   System.out.println("Bowling Average: "+bowling_Avg);
		 }
		 else
		 {
			 System.out.println("Error");
		 }
	 }
	 
	 public void computeStrikeRate()
	 {
		 if(wickets > 0 && runs_conceded > 0 && matches > 0 && balls_bowled > 0)
		 {
			 float strike_rate = (float)runs_conceded / balls_bowled;
			 System.out.println("Name: "+name);
			 System.out.println("Strike Rate: "+strike_rate);
		 }
		 else
		 {
			 System.out.println("Error");
		 }
	 }
	 
	 public void showStatistics()
	 {
		 if(wickets > 0 && runs_conceded > 0 && matches > 0 && balls_bowled > 0)
		 {
			 System.out.println("Name: "+name);
			 System.out.println("Wickets: "+wickets);
			 System.out.println("Matches: "+matches);
			 System.out.println("Balls Bowled: "+balls_bowled);
			 System.out.println("Runs Conceded: "+runs_conceded);
		 }
		 else
		 {
			 System.out.println("Error");
		 }
		 
	 }
	 
}
