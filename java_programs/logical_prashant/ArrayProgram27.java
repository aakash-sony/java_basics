/*
--Delete the element at specific position
*/
import java.util.*;
public class ArrayProgram27
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element that you want to delete: ");
		int ele = sc.nextInt();
		
		
		int result[] = deletingElement(a, ele);
		System.out.println("Array is: "+Arrays.toString(result));
	}
	
	public static int[] deletingElement(int arr[], int ele)
	{
		  int flag = 0;
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] == ele)
				{
					for(int j = i; j < arr.length - 1; j++)
					{
						arr[j] = arr[j + 1];
					}
					flag = 1;
				    break;
				}
				
			}
			
			if(flag == 0)
			{
				System.out.println("Element not found!!");
				return arr;
			}
			else
			{
				int newArr[] = new int[arr.length - 1];
				for(int i = 0; i < newArr.length; i++)
				{
					newArr[i] = arr[i];
				}
				return newArr;
			}
	}
}
