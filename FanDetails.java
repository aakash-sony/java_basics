/*
Q) Write a Program on OOPs to define Fan class properties and behaviour.

properties :

name    : String
coil    : String
wings	: int

behaviour:

switchOn()  : public void
switchOff() : public void  
--------------------------------------------------------------------------------
*/
import java.util.Scanner;
class Fan
{
  String fanName;
  String fanCoil;
  int fanWings;

  public void switchOn()
 {
    System.out.println("Fan switch is on.");
 }
 public void switchOff()
 {
    System.out.println("Fan switch is off.");
 }

}

public class FanDetails
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Fan fan = new Fan();

      System.out.print("Enter fan name: ");
      fan.fanName = sc.nextLine();

      System.out.print("Enter fan coil: ");
      fan.fanCoil = sc.nextLine();

      System.out.print("Enter fan wings: ");
      fan.fanWings = sc.nextInt();

      fan.switchOn();
      fan.switchOff();

   }
}
 