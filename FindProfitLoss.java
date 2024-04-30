/*
Q)
   Write a java program to find the profit and loss by following the formula
   Profit and loss Formulas – 
   Profit = SP – CP
   Loss = CP – SP
   Profit percentage = (Profit /Cost Price) x 100
   Loss percentage = (Loss / Cost price) x 100
-------------------------------------------------------------------------------
*/
public class FindProfitLoss
{
     public static void main(String[] args)
     {
         double sellingPrice = Double.parseDouble(args[0]);
         double costPrice = Double.parseDouble(args[1]);

         double profit = sellingPrice - costPrice;
         double loss = costPrice - sellingPrice;
         
         double profit_percentage = (profit / costPrice) * 100;
         double loss_percentage = (loss / costPrice) * 100;

        if(sellingPrice > costPrice)
       {
          System.out.println("Total Profit: "+profit);
          System.out.println("Total Profit Percentage: "+profit_percentage); 
       }
       else
       {
          System.out.println("Total Loss"+loss);
          System.out.println("Total Loss Percentage: "+loss_percentage);
       }
   }

}