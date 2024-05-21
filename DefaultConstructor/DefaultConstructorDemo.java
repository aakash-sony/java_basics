public class DefaultConstructorDemo {

	public static void main(String[] args)
	{
		DefaultConstructor p1 = new DefaultConstructor();
		DefaultConstructor p2 = new DefaultConstructor("Akash Soni", 20);
		DefaultConstructor p3 = new DefaultConstructor(50);
		DefaultConstructor p4 = new DefaultConstructor(26);
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		p4.displayDetails();
		
	}

}
