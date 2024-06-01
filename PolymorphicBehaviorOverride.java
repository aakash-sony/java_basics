class Animal
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal
{
	@Override
	public void roam()
	{
		System.out.println("Lion is roaming");
	}
}
class Tiger extends Animal
{
	@Override
	public void roam()
	{
		System.out.println("Tiger is roaming");
	}
}
class Dog extends Animal
{
	@Override
	public void roam()
	{
		System.out.println("Dog is roaming");
	}
}


public class PolymorphicBehaviorOverride {

	public static void main(String[] args) 
	{
		Lion l = new Lion();
		Tiger t = new Tiger();
		
		animalRoaming(l);
		animalRoaming(t);
		animalRoaming(new Dog());
		
	}
	
	public static void animalRoaming(Animal animal)
	{
		animal.roam();
	}

}