/*
Q) A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input   the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000					5
	>=5000 and <10000			10
	>=10000					15

   Display Discount %, Discount Amount and Amount Payable.
------------------------------------------------------------------------------------------------------
*/
public class DiscountCalculation
{
   public static void main(String args[])
   {
        double netBill = Double.parseDouble(args[0]);

        double payableAmount, discountAmount;

      if(netBill < 5000 && netBill >= 0)
      {
          discountAmount = netBill * 5 / 100;
          payableAmount = netBill - discountAmount;
      }

      else if(netBill >= 5000 && netBill < 10000)
      {
          discountAmount = netBill * 10 / 100;
          payableAmount = netBill - discountAmount;
      }

      else
      {
          discountAmount = netBill * 15 / 100;
          payableAmount = netBill - discountAmount;
      }
     
      System.out.println("Discount amount: "+discountAmount);

      System.out.println("Payable Amount : "+payableAmount);
   }
}