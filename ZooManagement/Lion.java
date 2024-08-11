public class Lion extends Animal 
{
   private int maneLength;

  public Lion(String animalName, int animalAge, int maneLength)
  {
	super(animalName, animalAge);
	this.maneLength = maneLength;
  }
  public void makeSound()
  {
	  System.out.println("The Lion roars loudly.");
  }
  public void displayManeLength()
  {
	  System.out.println("Mane Length: "+maneLength);
  }   
   
}
