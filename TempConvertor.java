/*
Q) Write a program in java to convert temperature Fahrenheit to Celsius Program.
   Formula is :-  celsius=((fahrenheit-32)*5)/9;
-------------------------------------------------------
*/
public class TempConvertor
{
     public static void main(String args[])
     {
         float fahrenheit = Float.parseFloat(args[0]);

         float celsius=((fahrenheit-32)*5)/9;

         System.out.println("Temperature in celsius= "+celsius);
     }
}