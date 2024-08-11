import java.util.Scanner;
@FunctionalInterface
record Player(int playerId, String playerName, double basePrice)
{	
}


public class Supplier2 {

	public static void main(String[] args)
	{
		Supplier<Player> s3 = ()->
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Player id :");
			int id = sc.nextInt();
			
			System.out.print("Enter player name :");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Enter Player base Price :");
			double basePrice = sc.nextDouble();
			
			
			return new Player(id, name, basePrice);
		};
		
		Player obj = s3.get();
		System.out.println(obj);
		
	}

}