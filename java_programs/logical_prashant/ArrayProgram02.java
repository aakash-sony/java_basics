/*
  Que- Given an array of integers, return true if the array length is 1 or more,and the first element and the
   last elements both are equal. 
*/
public class ArrayProgram02
{
	public static void main(String args[])
	{
		int arr[] = {67, 78, 45, 89, 90};
		System.out.println(checkingElement(arr));
			
	}
	static boolean checkingElement(int arr[])
	{
		if(arr.length > 0 && (arr[0] == arr[arr.length - 1]))
			{
				return true; 
			}
			else
			{
				return false;
			}
	}
	
}