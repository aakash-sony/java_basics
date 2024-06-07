import java.util.*;

public class CompoundInterestCalculator 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter Principle amount: ");
		double principle =  sc.nextDouble();
		
		System.out.print("Enter Interest rate: ");
		double rate =  sc.nextDouble();

        double amount = principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
        double compoundInterest = amount - principle;
        
        System.out.println("Principle amount: "+principle);
        System.out.println("Annual Interest rate: "+rate);
        System.out.println("Compound Interest: "+compoundInterest);
        
    }
}