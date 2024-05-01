/*
Que-4) write Java Program Convert Fahrenheit To Celsius | Vice Versa
 Formula-
 Celsius=(Fahrenheit-32)*5/9;
 Fahrenheit=((9*Celsius)/5)+32;
 Note [ Write two seprate program for converting celsius into 
Fahrenheit
 and Fahrenheit into celsius ]
-----------------------------------------------------------------------
*/
public class TempCalculator
{
	public static void main(String args[])
       {
              double fahrenheit = Double.parseDouble(args[0]);
	     double celsius = Double.parseDouble(args[1]);

		fahrenheitToCelsius(fahrenheit);
		
		celsiusToFahreheit(celsius);
       }

        static void fahrenheitToCelsius(double fahrenheit)
        {
	   
 	    double celsius= (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: "+celsius);
        } 

	 static void celsiusToFahreheit(double celsius)
        {
	  
 	    double fahrenheit = ((9 * celsius) / 5) + 32;

            System.out.println("Temperature in Fahrenheit: "+fahrenheit);
        }
	
}