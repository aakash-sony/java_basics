import java.util.Scanner;
public class CarDemo
{
   public static void main(String args[])
   {
      Car car = new Car();
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter car model: ");
      car.carModel = sc.nextLine();

      System.out.print("Enter car color: ");
      car.carColor = sc.nextLine();

      System.out.print("Enter car seater: ");
      car.carSeater = sc.nextInt();

      car.getCarDetails();
       
      System.out.print("Do you want to on the car(y/n): ");
      car.choice = sc.next().charAt(0);
     
      if(car.choice == 'Y' || car.choice == 'y')
     {
        car.carOn();
     }
     else
     {
        car.carOff();
     }
   }
}