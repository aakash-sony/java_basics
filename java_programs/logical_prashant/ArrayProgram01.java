/* 
  Que- Given an array of integers, return true if 15 appears as either the first or last element in the array.
  The array will be length 1 or more.
*/ 
public class ArrayProgram01
{
	public static void main(String args[])
	{
		int arr[] = {2, 3, 12, 23, 15, 5};
		System.out.println(checkingElement(arr));
			                                        
	}
	static boolean checkingElement(int arr[])
	{
		if(arr[0] == 15 || arr[arr.length - 1] == 15)
			{
				return true; 
			}
			else
			{
				return false;
			}
	}
	
}