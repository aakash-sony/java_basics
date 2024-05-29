import java.util.Scanner;
class CalculateGrade
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first subject marks(out of 100): ");
		int sub1 = sc.nextInt();
		
		System.out.print("Enter second subject marks(out of 100): ");
		int sub2 = sc.nextInt();
		
		System.out.print("Enter third subject marks(out of 100): ");
		int sub3 = sc.nextInt();
		
		System.out.print("Enter fourth subject marks(out of 100): ");
		int sub4 = sc.nextInt();
		
		System.out.print("Enter fifth subject marks(out of 100): ");
		int sub5 = sc.nextInt();
		
		System.out.println("Student average is : "+calculateAverage(sub1, sub2, sub3, sub4, sub5));
		
		System.out.println("Student grade is : "+calculateGrade(calculateAverage(sub1, sub2, sub3, sub4, sub5)));	
		
	}
	
	static float calculateAverage(int a, int b, int c, int d, int e)
	{
		int sum = a + b + c + d + e;
		float average = (float)sum / 5;
		
		return average;
	}
	
	static char calculateGrade(float average)
	{	
	    char grade;
		if(average >= 85)
		{
			grade = 'A';
		}
		else if(average >= 75)
		{
			grade = 'B';
		}
		else if(average >= 65)
		{
			grade = 'C';
		}
		else if(average >= 35 && average < 65)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		return grade;
	}
}