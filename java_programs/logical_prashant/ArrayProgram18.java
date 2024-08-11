/*
  Binary Searching:-
  ----------------
*/
import java.util.*;
public class ArrayProgram18
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		System.out.println("Array: "+Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element which you want to search: ");
		int element = sc.nextInt();
		int index = Arrays.binarySearch(a, element);
		if(index >= 0)
		{
			System.out.println(element+" is available at index: "+index);
		}
		else
		{
			System.out.println("Element not found!!");
		}
			
	}
}