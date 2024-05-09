import java.util.Scanner;
public class FactorialDemo
{
   public static void main(String args[])
   {
      Factorial factorial = new Factorial();
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number for finding factorial: ");
      factorial.number = sc.nextInt();

      factorial.getFactorial();
   }
}