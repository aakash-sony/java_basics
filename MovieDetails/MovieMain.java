import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name: ");
		String movie = sc.nextLine();
		
		System.out.println("Enter release year: ");
		int year = sc.nextInt();
		
		System.out.println("Enter generation: ");
		String gen = sc.nextLine();
		gen = sc.nextLine();
		
		Movie m = new Movie(movie, year, gen);
		System.out.println(m);
	
	}

}
