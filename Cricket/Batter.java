public class Batter
{
     private String name;
     private int runs;
     private int matches;
     private float batting_avg;
     
     public void batterDetails(String name, int matches, int runs)
     {
    	 this.name = name;
    	 this.matches = matches;
    	 this.runs = runs;
     } 
     
     public void computeBattingAvg()
     {
    	 if(runs > 0 && matches > 0)
    	 {
    	    batting_avg = (float)runs / matches;
    	    System.out.println("Name: "+name);
    	    System.out.println("Batting average: "+batting_avg);
    	 }
    	 else
    	 {
    		 System.out.println("Error");
    	 }
     }
     
     public void getStatistics()
     {
    	 if(runs > 0 && matches > 0)
    	 {
    		 System.out.println("Name: "+name);
    		 System.out.println("Runs: "+runs);
    		 System.out.println("Matches: "+matches);
    	 }
     }
     
}
