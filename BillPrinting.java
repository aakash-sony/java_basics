/*
Q) Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.
-----------------------------------------------------------------------------------------------------
*/

public class BillPrinting
{
     public static void main(String []args)
     {
          int finalBill,chickenRollsBill,vegetablePuffsBill;
          
          int chickenRollPrice = 60;
          int vegetablePuffPrice = 25;
          int discount = 50;

          chickenRollsBill = chickenRollPrice * 4;
          vegetablePuffsBill = vegetablePuffPrice * 3;

           finalBill = chickenRollsBill + vegetablePuffsBill - discount;  

          System.out.println("The bill of chickenRolls: "+chickenRollsBill);  
          System.out.println("The bill of vegetablePuffs: "+vegetablePuffsBill);
          System.out.println("The Final bill: "+finalBill);

      }

}