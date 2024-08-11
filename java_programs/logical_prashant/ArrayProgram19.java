/*
 *   Compare the 2 array and if every element matched
 *   return true and if any single element not matched
 *   at once return false and break;
*/
import java.util.*;
public class ArrayProgram19
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = {1, 2, 3, 4, 5, 6};
		System.out.println(compareArray(a, b));
			
	}
	public static boolean compareArray(int arr1[], int arr2[])
	{
		if(arr1.length == arr2.length)
		{
			int flag = 0;
			for(int i = 0; i < arr1.length; i++)
			{
				if(arr1[i] == arr2[i])
				{
					flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if(flag == 0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			System.out.println("Lengths are not same, can't compare.");	
		}
		return false;
	}
}