@FunctionalInterface
interface Calculate
{
	void doSum(int x, int y);
}


public class LambdaDemo1 
{
	public static void main(String[] args) 
	{
		Calculate c = (a, b)-> System.out.println("Sum is :"+(a+b));
		c.doSum(12, 24);
	}

}