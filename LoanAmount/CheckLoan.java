import java.util.Scanner;

public class CheckLoan {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the interest rate: ");
		double interestRate = sc.nextDouble();
		
		System.out.println("Enter the month duration: ");
	    int months = sc.nextInt();
	    
		Loan l = new Loan(amount, interestRate, months);

		System.out.println("Total monthly Payment: "+l.calculateMonthlyPayment());
	
		sc.close();

	}

}
