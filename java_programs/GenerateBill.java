public class GenerateBill 
{
	
	public static void main(String args[])
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
          System.out.println("Discout: "+discount);
          System.out.println("The Final bill: "+finalBill);

      }

}