/*
Linear Searching:-
-----------------
*/
import java.util.*;
public class ArrayProgram16
{
	public static void main(String args[])
	{
		int a[] = {3, 65, 78, 56, 2, 65};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element which you want to search: ");
		int element = sc.nextInt();
		searchingElement(a, element);
			
	}

	static void searchingElement(int arr[], int ele)
	{
		int flag = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ele)
			{
				System.out.println(ele+" is available at index "+i);
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("Element not found!!");
		}
	}
}