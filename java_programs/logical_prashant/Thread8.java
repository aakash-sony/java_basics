
public class Thread8
{
	public static void main(String[] args) 
	{		
		try
		{
			Horse h = new Horse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Thread8();
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}		
	}
	
}
class Horse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
