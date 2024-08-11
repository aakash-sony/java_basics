import java.util.Scanner;
public class ScoreChecking
{
	static int score1, score2;
	static String name1, name2;
      public static void main(String args[])
      {
	  Scanner sc = new Scanner(System.in);

	  System.out.print("Enter Ist Name: ");
	  name1 = sc.nextLine();

	  System.out.print("Enter Ist Score points: ");
	  score1 = sc.nextInt();

	  System.out.print("Enter 2nd Name: ");
	  name2 = sc.nextLine();
	  name2 = sc.nextLine();

	  System.out.print("Enter 2nd Score points: ");
	  score2 = sc.nextInt();

	   checkingWinner();	  
      }
        
       public static void checkingWinner()
       {
	   if(score1 > score2)
	    {
		System.out.println(name1+" is "+" winner by "+(score1 - score2)+" points.");
		
            }
	   else if(score2 > score1)
	    {
		 System.out.println(name2+" is "+" winner by "+(score2 - score1)+" points.");
		 
            }
	    else
	    {
		System.out.println("Both scores are equal.");
	    }
	 }
		   		        
}

