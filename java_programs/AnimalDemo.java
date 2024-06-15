class Animal
{
  public void eat()
  {
    System.out.println("Animal eating ");
  }
  
  public void eat(String s) 
  {
     System.out.println("Animal eating "+s);
  }
  
}

class Horse extends Animal
{
    public void eat() 
   {
     System.out.println("Horse eating");
   }

   public void eat(String s) 
  {
     System.out.println("Horse eating "+s);
  }
}

public class AnimalDemo
{
   public static void main(String [] args) 
  {
    Animal a = new Horse();
    a.eat(); 
    a.eat("Grass");
  }
}
