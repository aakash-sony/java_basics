/*
Sorting:-
1) Hold the element and check with alternate ele.
*/
import java.util.*;
public class ArrayProgram12
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
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}