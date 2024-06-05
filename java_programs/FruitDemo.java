//Copy constructor
import java.util.Scanner;
class Fruit
{
	private double fPrice;
	private String fName;
	
	Fruit(double fPrice, String fName)
	{
		this.fPrice = fPrice;
		this.fName = fName;
	}
	
	Fruit(Fruit f)    // Copy Constructor
	{
		fPrice = f.fPrice;
		fName = f.fName;
	}
	
	void displayDetails()
	{
		System.out.println("Fruit Name: "+fName);
		System.out.println("Fruit Price: "+fPrice);
	}
}

public class FruitDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fruit Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Fruit Price: ");
		double price = sc.nextDouble();
		
		Fruit f1 = new Fruit(price, name);
		f1.displayDetails();
		
		Fruit f2 = new Fruit(f1);
		f2.displayDetails();
	}
}