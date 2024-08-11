public class MarksSumAndAverage
{
     public static void main(String args[])
     {
         int sub1 = Integer.parseInt(args[0]);
         int sub2 = Integer.parseInt(args[1]);
         int sub3 = Integer.parseInt(args[2]);
         int sub4 = Integer.parseInt(args[3]);
         int sub5 = Integer.parseInt(args[4]);

      double sum = (sub1 + sub2 + sub3 + sub4 + sub5);
      double average = (double)(sum / 5);

      System.out.println("Sum of marks of subjects: "+sum);
      System.out.println("Average of marks is: "+average);
     }
}