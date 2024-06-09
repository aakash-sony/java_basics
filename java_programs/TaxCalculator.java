public class TaxCalculator
{
    public static void main(String[] args)
    {
  
      double income = 990000;
      final double TAX_RATE = 4.9;
      double tax = (income * TAX_RATE) / 100;
      System.out.println("Tax: "+tax +"RS.");      
   }

}