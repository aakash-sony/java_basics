class SecondThread extends Thread
{
	int val = 0;
	
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=1; i<=100; i++)
			{
				val = val + i;
			}
			System.out.println("Sending notification");
			notify();	
			
		}//Here actually the lock will be released
	}
	
}


public class ITCDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread started!!");
		
		SecondThread b = new SecondThread();
		b.start();
					
		synchronized(b)
		{
			System.out.println("Main Thread is waiting Here");
			b.wait();
			System.out.println("Main Thread Wake up");
			System.out.println(b.val);
			
		}
		

	}

}