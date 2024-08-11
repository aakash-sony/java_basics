class Vehicle
{
    private String brand;
    private String model;
    
    Vehicle(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }
    void startEngine()
    {
        System.out.println("Car is running");
    }
    
    void stopEngine()
    {
        System.out.println("Car is stopped");
    }
    
    void displayInfo()
    {
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle
{
    private String fuelType;
    Car(String brand, String model, String fuelType)
    {
        super(brand, model);
        this.fuelType = fuelType;
    }
}

class SportsCar extends Car
{
    private int topSpeed;
    SportsCar(String brand, String model, String fuelType, int topSpeed)
    {
        super(brand, model, fuelType);
        this.topSpeed = topSpeed;
    }
    
    void performSpecialAction()
    {
        System.out.println("Sports Car is showing special action");
    }
}

public class MyProgram
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle("Suzuki", "XL6");
        
        v.displayInfo();
        v.startEngine();
        v.stopEngine();
        System.out.println();
        
        Car c = new Car("Suzuki", "Baleno", "CNG");
       
        c.displayInfo();
         c.startEngine();
        c.stopEngine();
        System.out.println();
        
      SportsCar s = new SportsCar("Ferari", "GT", "CNG", 350);
     
      s.displayInfo();
      s.startEngine();
      s.stopEngine();
      s. performSpecialAction();
        
    }
}