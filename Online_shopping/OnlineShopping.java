public class OnlineShopping {

	public static void main(String[] args) 
	{
		Electronics e = new Electronics("Cooler", 9499, 1, "Crompton");
		Clothing c = new Clothing("Jeans", 1400, 2, "32 inch");
		
		e.displayInfo();
		System.out.println("Total Price: "+e.calculateTotalCost(1));
		System.out.println("*********************************");
		c.displayInfo();
		System.out.println("Total  Price: "+c.calculateTotalCost(2));

	}

}
