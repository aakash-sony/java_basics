class Car 
{
    private String fuelType;
    private int gears;
    
    Car(String fuelType, int gears)
    {
        this.fuelType = fuelType;
        this.gears = gears;
    }
   void start()
    {
        System.out.println("Car is starting.");
    }
    void stop()
    {
        System.out.println("Car is stopping.");
    }
    void displayDetails()
    {
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Gears: "+gears);
    }
}

class BMW extends Car
{
    private String color;
    private String carNo;
    
    BMW(String fuelType, int gears, String color, String carNo)
    {
        super(fuelType, gears);
        this.color = color;
        this.carNo = carNo;
    }
    void start()
    {
        System.out.println("BMW Car is starting.");
    }
    void stop()
    {
        System.out.println("BMW Car is stopping.");
    }
    void displayDetails()
    {
        System.out.println("BMW Color: "+color);
        System.out.println("BMW Car number: "+carNo);
    }
}
class Audi extends Car
{
    private String color;
    private String carNo;
    
    Audi(String fuelType, int gears, String color, String carNo)
    {
        super(fuelType, gears);
        this.color = color;
        this.carNo = carNo;
    }
   void start()
    {
        System.out.println("Audi Car is starting.");
    }
    void stop()
    {
        System.out.println("Audi Car is stopping.");
    }
      void displayDetails()
    {
        System.out.println("AUDI Color: "+color);
        System.out.println("AUDI Car number: "+carNo);
    }
}

class Driver
{
    void ride(Audi a)
    {
        System.out.println("Audi is a good car.");
    }
    void ride(BMW b)
    {
        System.out.println("BMW is a best car.");
    }
}
public class Overriding
{
    public static void main(String[] args)
    {
        BMW bm = new BMW("Petrol", 4, "Black", "UP42AT4567");
        bm.displayDetails();
        bm.start();
        bm.stop();
        Driver d = new Driver();
        d.ride(bm);
       
        System.out.println();
        Audi ad = new Audi("Petrol", 5, "Red", "UP42AT4588");
        ad.displayDetails();
        ad.start();
        ad.stop();
        d.ride(ad);
       
    }
}