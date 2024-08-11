import java.util.Scanner;

public class MarketSimulation {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
     	System.out.println("Enter Customer name: ");
		String name = sc.nextLine();
		
		Customer c = new Customer(name);
		
		Clothing cl = new Clothing("32 inch", c);
		cl.purchase(2);
		
		Grocery gc = new Grocery("25-DEC-2024", c);
		gc.purchase(3);
		
		Electronic e1 = new Electronic("2 years warranty", c);
		e1.purchase(4);
		sc.close();

	}

}
