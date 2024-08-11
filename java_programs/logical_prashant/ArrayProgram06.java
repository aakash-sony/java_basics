/*
Given an array of integers length 3, figure out which is larger element in that array and
return the largest element with the help of the method ?
*/
import java.util.Arrays;
public class ArrayProgram06
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78};	
		System.out.println("Largest Element: "+largestElement(a));	
	}
	
	static int largestElement(int a[])
	{
		int largestEle = a[0];
		if(largestEle > a[1] && largestEle > a[2])
		{
			largestEle = a[0];
		}
		else if(a[1] > a[2])
		{
			largestEle = a[1];
		}
		else
		{
			largestEle = a[2];
		}
		return largestEle;
	}
	
}