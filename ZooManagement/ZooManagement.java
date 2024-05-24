public class ZooManagement {

	public static void main(String[] args) 
	{
		Lion l = new Lion("Lion", 10, 3);
		Elephant e = new Elephant("Elephant", 12, 12);
		
		l.displayInfo();
		l.displayManeLength();
		l.makeSound();
		System.out.println("************************");
		e.displayInfo();
		e.displayTuskLength();
		e.makeSound();

	}

}
