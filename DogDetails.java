/*
Q) Write a Program on OOPs to define Dog class properties and behaviour.

properties :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void  
----------------------------------------------------------------------------------------------
*/
import java.util.Scanner;
class Dog
{
  String dogName;
  double dogHeight;
  int dogAge;

	
   public void getDogInformation()
   {
      System.out.println("Dog Details:-- ");
      System.out.println("Dog Name: "+dogName);
      System.out.println("Dog Height: "+dogHeight);
      System.out.println("Dog Age: "+dogAge);
   }

    public void bark()
   {
      System.out.println("Dog is barking...");
   }

}

public class DogDetails
{
     public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	
	Dog dog = new Dog();

        System.out.print("Enter name: ");
     	dog.dogName = sc.nextLine();

        System.out.print("Enter dog height: ");
        dog.dogHeight = sc.nextDouble();

        System.out.print("Enter dog age: ");
        dog.dogAge = sc.nextInt();

        

	dog.getDogInformation();
        
        dog.bark();
       
    }
}