import java.util.Scanner;

public class BalanceChecking
{
    static double balance = 2000;
    static double amount;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 'w' for Withdraw and 'd' for deposit");
		char ch = sc.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
		  case 'd':
			  System.out.print("Enter amout for deposit: ");
			  amount = sc.nextDouble();
			  deposit(amount);
			  break;
		  case 'w':
			   System.out.print("Enter amout for withdraw: ");
			    amount = sc.nextDouble();
				withdraw(amount);
				break;
		   default:
			   System.out.println("Invalid option.");
			   return;
		}
		
		System.out.println("Available balance is: "+balance);
	}
	public static void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance = balance - amount;
		}
		else if(amount <= 0)
		{
			System.out.println("Amount can't be negative and zero.");
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}
	}
	
	public static void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
		}
		else 
		{
			System.out.println("Amount can't be negative and zero.");
		}
		
	}

}
