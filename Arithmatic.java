
public class Arithmatic
{
   public static void main(String[] args)
   {
      int x = 10;
      int y = 20;  

      int result = addition(x, y);
      System.out.println("Sum of x and y is: " + result);

      result = subtraction(x, y);
      System.out.println("Subtraction of x and y is: " + result);

      result = multiplication(x, y);
      System.out.println("Multiplication of x and y is: " + result);

      result = division(x, y);
      System.out.println("Division of x and y is" + result);
      
   }

   static int addition(int x, int y)
  {
     int z;
     return z = x + y;
  }

   static int subtraction(int x, int y)
  {
     int z;
     return z = x - y;
  }

   static int multiplication(int x, int y)
  {
     int z;
     return z = x * y;
  }

   static int division(int x, int y)
  {
     int z;
     return z = x / y;
  }

}

