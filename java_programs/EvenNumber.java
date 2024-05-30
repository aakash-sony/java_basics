import java.util.Scanner;
class EvenNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter last number: ");
		int n2  = sc.nextInt();
		
		printingEvenNumber(n1, n2);
	}
	
	static void printingEvenNumber(int n1, int n2)
	{
		for(int i = n1; i <= n2; i++)
		{
		  if(i % 2 == 0)
		  {
			System.out.print(i+" ");
    	  }	
		  
		}
	}
}