
@FunctionalInterface
interface Vehicle
{
	void run();  //[SAM -> Single Abstract Method]
}

public class LambdaDemo4 
{
	public static void main(String[] args) 
	{
		Vehicle car = ()-> System.out.println("Car is Running");
		
		Vehicle bike = ()-> System.out.println("Bike is Running");
		
		Vehicle bus = ()-> System.out.println("Bus is Running");
		
		car.run();  bike.run();  bus.run();

	}

}