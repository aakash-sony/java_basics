public class Elephant extends Animal 
{
    private float tuskLength;

	public Elephant(String animalName, int animalAge, float tuskLength) {
		super(animalName, animalAge);
		this.tuskLength = tuskLength;
	}
    
	public void makeSound()
	{
		System.out.println("The Elephant trumpets.");
	}
	public void displayTuskLength()
	{
		System.out.println("Tusk Length: "+tuskLength);
	}
}
