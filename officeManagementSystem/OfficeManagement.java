public class OfficeManagement {

	public static void main(String[] args)
	{
		Technical t = new Technical("Akash", 15000, "Technical", 2000);
		Production p  = new Production("Vikas", 18000, "production", 3000, 6000);
		Utility u = new Utility("Akash", 15000, "Utility", 2000, 1800);
		Finance f = new Finance("Akash", 15000, "Finance", 2000, 1800);
		
		t.displayInfo();
		System.out.println("**************************");
		p.displayInfo();
		System.out.println("**************************");
		u.displayInfo();
		System.out.println("**************************");
		f.displayInfo();

	}

}
