class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal is eating");
	}
}
class Lion extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Lion is eating");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}

class Dog extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}


public class PolymorphicBehaviour 
{
	public static void main(String[] args) 
	{
		animalType(new Dog());
		
	}

	public static void animalType(Animal animal)
	{
		if(animal instanceof Dog)
		{
			Dog d1 = (Dog) animal;
			d1.eat();
			d1.bark();
		}
		else if(animal instanceof Lion)
		{
			Lion lion = (Lion) animal;
			lion.eat(); lion.roar();
		}
		
	}
}