public class Bike extends Vehicle
{ 
    public static String start() 
   { 
      return "Bike started"; 
   } 
   public static void main(String[] args) 
  { 
    Bike b = new Bike(); 
    Vehicle v = new Bike(); 
    System.out.println(b.start()+" "+v.start()); 
  } 
} 
class Vehicle
{ 
   public static String start()
  { 
     return "vehicle started";   
  } 
}