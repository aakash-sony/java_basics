public class Animal
{
   private String animalName;
   private int animalAge;
   
   public Animal(String animalName, int animalAge) {
	super();
	this.animalName = animalName;
	this.animalAge = animalAge;
}
   
   public void makeSound()
   {
	   System.out.println("The animal makes a generic sound.");
   }
   
   public void displayInfo()
   {
	 System.out.println("Animal name: "+animalName);  
	 System.out.println("Animal Age: "+animalAge);
   }
}
