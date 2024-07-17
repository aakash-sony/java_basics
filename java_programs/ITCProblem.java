class ThreadA extends Thread
{
	int val = 0;
	
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(int i=1; i<=10; i++)
		{
			val = val + i;  // 1   3    6     10     15
		}		
	}
}

public class ITCProblem 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadA  a1 = new ThreadA();
		a1.start();
		
		Thread.sleep(200);
		
		System.out.println(a1.val);

	}

}