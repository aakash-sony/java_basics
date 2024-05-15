import java.util.Scanner;
public class MultiplyOfArrayElements
{
     static int[] arr;
     static int multiply = 1;
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array: ");
	int size = sc.nextInt();

	arr = new int[size];

	initializeArray(size);
	printingMultiplyOfElements(size);
	
     }

     static void initializeArray(int size)
     {
	Scanner sc1 = new Scanner(System.in);
	for(int i = 0; i < size; i++)
        {
	    System.out.print("Enter "+(i + 1)+" Element: ");
	    arr[i] = sc1.nextInt();
	}
     }

     static void printingMultiplyOfElements(int size)
     {
	System.out.println("The Array is: ");
        for(int i = 0; i < size; i++)
	{
	   System.out.print(" "+arr[i]+" ");
	   multiply = multiply * arr[i];
	}
 	System.out.println("Multiply of Elements: "+multiply);
     }
}