/*
Given an array of integers, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist,
return 0 if the array is having length 0. 
*/
import java.util.Arrays;
public class ArrayProgram08
{
	public static void main(String args[])
	{
		int a[] = {};	
		System.out.println("Sum: "+sumOfElement(a));	
	}
	
	static int sumOfElement(int a[])
	{
		int sum = 0;
		if(a.length >= 2)
		{
			sum = a[0] + a[1];
		}
		else if(a.length > 0 && a.length < 2)
		{
			sum = a[0];
		}
		else
		{
			return sum;
		}
		return sum;
	}
	
}