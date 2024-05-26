import java.util.Scanner;
class SumOfArrayElements
{
	static int arr[];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		
		 arr = new int[size];
		
		initializeArray(size);
		
		System.out.println("The Array is: ");
		printingArray(size);
		
		System.out.println("\nThe Sum of all array elements: "+sumOfArrayElements(size));
			   	
	}
	
	static void initializeArray(int size)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter the "+(i + 1)+" element: ");
			arr[i] = sc.nextInt();
		}

	}
	
	static void printingArray(int size)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
	
	static int sumOfArrayElements(int size)
	{
	    int sum = 0;
		for(int i = 0; i < size; i++)
		{
			sum = sum + arr[i];
		}
		
		return sum;
	}
	
}