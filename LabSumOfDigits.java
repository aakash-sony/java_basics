import java.util.*;
public class LabSumOfDigits 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int number1 = sc.nextInt();
     System.out.print("Enter second number: ");
     int number2 = sc.nextInt();
     
     int sum = number1 + number2;
     System.out.println("Sum is: "+sum);
     if(sum >= 10 && sum <= 99)
     {
        int sumOfDigits = (sum/10) + (sum%10);
        System.out.println("Sum of digits: "+sumOfDigits);
     }
     else if(sum < 0)
     {
         System.out.println("-3");
     }
     else if(sum > 99)
     {
         System.out.println("-2");
     }
     else
     {
         System.out.println("-1");
     }
     
    }
}