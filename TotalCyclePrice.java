/*
Q) Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and    added new accessories worth Rs. 500. Rohan wants to make a profit of Rs. 1500 on selling the cycle.    Find the selling price of the cycle. Write a java program to store all values and calculate and    display the selling price.
-----------------------------------------------------------------------------------------------------
*/
public class TotalCyclePrice
{
     public static void main(String args[])
     {
          double costPrice = 1200;
          double spendOnRepairs = 250;
          double spendOnColoring = 350;
          double spendOnAcessories = 500;

          double totalSellingPrice = costPrice + spendOnRepairs + spendOnColoring + spendOnAcessories                                       + 1500;

           System.out.println("Total Cycle selling Price: "+totalSellingPrice);
       }
}