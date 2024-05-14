import java.util.Scanner;
public class VotingEligibility
{
     public static void main(String args[])
     {
	VotingEligibility v = new VotingEligibility();
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int age = sc.nextInt();

	v.checkingEligibility(age);
     }

     public void checkingEligibility(int age)
     {
	if(age >= 18)
	{
	   System.out.println("You are eligible for voting.");
	}
	else if(age > 0 && age < 18)
	{
	   System.out.println("You are not eligible for voting.");
	}
	else
	{
	   System.out.println("Age can't be in negative or zero.");
	}

     }

}