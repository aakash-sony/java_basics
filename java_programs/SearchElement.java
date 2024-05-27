import java.util.*;
class SearchElement
{
	static int arr[], ele, i;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		
		 arr = new int[size];
		
		initializeArray(size);
		
		System.out.println("The Array is: ");
		printingArray(size);
		
		System.out.print("\nWhich element do you want to search? ");
		ele = sc.nextInt();

		isSearchingElement(size);	
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

	static void isSearchingElement(int size)
	{
		int count = 0;
		for(i = 0; i < size; i++)
		{
		    if(arr[i] == ele)
			{
				System.out.println(ele+" is available at index "+i);
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("The element is not available in the array.");
		}
		
	}
}
	
