public class TVSetProfitCalculator
{
    public static void main(String args[])
    {
         double costPrice = 32500;

         double profit = 32500 * 27 / 100;

         double sellingPrice = 32500 + 32500 * 27 / 100;

         double vat =sellingPrice * 12.7 / 100;  

         double serviceCharge = sellingPrice * 3.87 / 100;

         double Total_sellingPrice = costPrice+ profit + vat + serviceCharge;  
         
         System.out.println("Total Cost Price: "+costPrice);
         System.out.println("Total Selling Price: "+Total_sellingPrice);
         System.out.println("Total Profit: "+profit);
         System.out.println("VAT charge: "+vat);
         System.out.println("Service Charge: "+serviceCharge);
     }
}