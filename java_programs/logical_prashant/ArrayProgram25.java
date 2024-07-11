/*
- fill all the array with the user-choice element as well as between index range.
*/
import java.util.*;
public class ArrayProgram25
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to fill: ");
		int ele = sc.nextInt();
		
		System.out.println("Enter the starting index to fill: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending index to fill: ");
		int end = sc.nextInt();
		
		int result[] = fillingElement(a, start, end, ele);
		System.out.println("New array: "+Arrays.toString(result));
	}
	
	public static int[] fillingElement(int arr[], int start, int end, int ele)
	{
		if(start >= 0 && end < arr.length)
		{
		  for(int i = start; i <= end; i++)
		  {
			arr[i] = ele;
		  }
		}
		else
		{
			System.out.println("wrong index!!");
			System.out.println("This is your array.");
		}
		return arr;
	}
}