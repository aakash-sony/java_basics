/*
Selection Sorting:-
-----------------
*/
import java.util.*;
public class ArrayProgram15
{
	public static void main(String args[])
	{
		int a[] = {3, 65, 78, 56, 2};	
		sortingElement(a);	
	}

	static void sortingElement(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			int min = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
			}
		int temp  = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}