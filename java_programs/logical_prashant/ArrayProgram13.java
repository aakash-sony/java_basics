/*
Sorting:-
1) Hold the element and check with itself 
*/
import java.util.*;
public class ArrayProgram13
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
			for(int j = 0; j < arr.length - 1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}