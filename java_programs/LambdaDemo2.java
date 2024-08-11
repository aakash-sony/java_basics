import java.util.Scanner;
@FunctionalInterface
interface Length
{
	int getLength(String str);
}

public class LambdaDemo2 {

	public static void main(String[] args) 
	{
		Length l = str -> str.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name to find out the length :");
		String name = sc.nextLine();
		
		System.out.println("Length of "+name+" is :"+l.getLength(name));
		sc.close();
		

	}

}
