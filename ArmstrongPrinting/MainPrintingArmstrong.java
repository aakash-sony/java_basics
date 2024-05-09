import java.util.*;
public class MainPrintingArmstrong
{
    public static void main(String args[])
    {
       PrintArmstrong a = new PrintArmstrong();
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the last number till which you want to print the armstong number: ");
       int number = sc.nextInt();

       a.printingArmstrong(number);
    }
}