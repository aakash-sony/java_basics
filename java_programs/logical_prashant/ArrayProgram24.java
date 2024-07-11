/*
- fill all the array with the user-choice element.
*/
import java.util.*;
public class ArrayProgram24
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to fill: ");
		int ele = sc.nextInt();
		
		// int result[] = fillingElement(a, ele);
		System.out.println("New array: "+Arrays.toString(fillingElement(a, ele)));
	}
	
	public static int[] fillingElement(int arr[], int ele)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = ele;
		}
		return arr;
	}
}