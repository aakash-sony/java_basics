/*
Bubble Sorting:-
---------------
*/
import java.util.*;
public class ArrayProgram14
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
			int flag = 0;
			for(int j = 0; j < arr.length - 1 - i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
		    if(flag == 0)
		   {
			 break;
		   }
		}
		System.out.println(Arrays.toString(arr));
	}
}