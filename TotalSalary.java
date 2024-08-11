/*
Q) Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument
-----------------------------------------------------------------------------------
*/
public class TotalSalary
{
    public static void main(String []args)
   {
      double basicSalary = Double.parseDouble(args[0]);

      double hra = (basicSalary * 15) / 100;
      double conveyanceAllowance = (basicSalary * 15) / 100;
      double entertainmentAllowance= (basicSalary * 10) / 100;

      double totalSalary = basicSalary + hra + conveyanceAllowance + entertainmentAllowance;

      System.out.println("Total Salary is: "+totalSalary);

    }

}