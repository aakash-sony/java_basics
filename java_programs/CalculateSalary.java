public class CalculateSalary
{
	public static void main(String args[])
	{

      double basicSalary = Double.parseDouble(args[0]);

      double hra = (basicSalary * 15) / 100;
      double conveyanceAllowance = (basicSalary * 15) / 100;
      double entertainmentAllowance= (basicSalary * 10) / 100;

      double totalSalary = basicSalary + hra + conveyanceAllowance + entertainmentAllowance;
        
         System.out.println("Basic Salary is: "+basicSalary);
         System.out.println("HRA is: "+hra);
         System.out.println("Total Salary is: "+totalSalary);

    }

}