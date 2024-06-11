import java.util.Scanner;

class PatternLab2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		
		patternPrinting(row);	
	}
	
	static void patternPrinting(int row)
	{
		for(int i = 0; i <= row; i++)
		{
			int a = 1;
			for(int j = 0; j <= i; j++)
			{
				System.out.print(a); 
				a++;
			}
			System.out.println();
		}
	}

}
