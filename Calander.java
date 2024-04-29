/*
Q) Write a program in java to input number of days. Find and display number of years, months and days.
-----------------------------------------------------------------------------------------------------
*/
public class Calander
{
    public static void main(String args[])
    {
       int numOfDays = Integer.parseInt(args[0]); 
      
       int year = numOfDays / 365;
       int remaining_days1 = numOfDays % 365;

       int month = remaining_days1 / 31;
       int remaining_days2 = remaining_days1 % 31;

       int week = remaining_days2 / 7;
       int remaining_days3 =remaining_days2 % 7;

       System.out.println("Year: "+year);
       System.out.println("Month: "+month);
       System.out.println("Week: "+week);
       System.out.println("Day: "+remaining_days3);
        
    }
}
