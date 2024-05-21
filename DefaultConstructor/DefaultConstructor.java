public class DefaultConstructor 
{
   String name;
   int age;
   
   public DefaultConstructor()
   {
	   this.name = "Akash";
	   this.age = 18;
   }
   public DefaultConstructor(String name)
   {
	   this.name = "ABC";
	   this.age = 19;
   }
   public DefaultConstructor(int age)
   {
	   this.age = 20;
	   this.name = "Mahesh";
   }
   public DefaultConstructor(String name, int age)
   {
	   this.name = "Suresh";
   }
   public void displayDetails()
   {
	   System.out.println("Name: "+name);
	   System.out.println("Age: "+age);
   }
    
}
