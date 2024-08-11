import java.util.Scanner;
class SmallestElement
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
		findSmallestNumber(size);
		   	
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
	
	static void findSmallestNumber(int size)
	{
		int smallestNum = arr[0];
		for (int i = 0; i < size; i++)
		{
			if(arr[i] < smallestNum)
			{
				smallestNum = arr[i];
			}
		}
		System.out.println("Smallest Element : "+smallestNum);
		
	}
	
}