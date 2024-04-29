/*
Q) A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of   12.7% and Service Charge is 3.87% is charged. Display total selling price, profit along with vat and   service charge.
-----------------------------------------------------------------------------------------------------
*/
public class TotalSellingPrice
{
    public static void main(String args[])
    {
         double costPrice = 32500;
         double profit = 32500 * 27 / 100;
         double vat = 32500 * 12.7 / 100;  
         double serviceCharge = 32500 * 3.87 / 100;

         double sellingPrice = 32500 + profit + vat + serviceCharge;  
    
         System.out.println("Total Selling Price: "+sellingPrice);
         System.out.println("Total Profit: "+profit);
     }
}