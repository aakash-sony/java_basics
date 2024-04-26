/*
Q) Write a program to calculate the tax for a taxable income of Rs.9,90,000, if the tax rate is fixed at 4.9%.
*/
public class TaxCalculation
{
   public static void main(String args[])
   {  
      double income = 990000;
      final double TAX_RATE = 4.9;
      double tax = (income * TAX_RATE) / 100;
      System.out.println("Tax: "+tax +"RS.");      
   }

}