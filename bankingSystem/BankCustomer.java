import java.util.Scanner;
public class BankCustomer
{
    public static void main(String args[])
    {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
	String bankCustomerName = sc.nextLine();

	System.out.print("Enter Bank Name: ");
	String bankName = sc.nextLine();

	System.out.print("Enter Bank Address: ");
	String bankAddress = sc.nextLine();

        System.out.print("Enter IFSC Code: ");
	String bankIFSCCode = sc.nextLine();

	System.out.print("Enter Customer Account Number: ");
	long customerAccountNumber = sc.nextLong();

        b.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber);
        b.choiceSelection();
	System.out.println(b.displayDetails());

	

    }
}