class Test implements Runnable
{
	@Override
	public void run()
	{		
		for(int i=1; i<=10; i++)
		{
			String name = Thread.currentThread().getName();

			System.out.println("i value is :"+i+" by thread :"+name);    
			
			if(name.equals("Child1"))
			{
				Thread.yield();  //Give a chance to Child2 Thread
			}

		}
   }
}
public class ThreadYieldMethod 
{
	public static void main(String[] args) 
	{
		Test obj = new Test();

		Thread t1 = new Thread(obj, "Child1");
		Thread t2 = new Thread(obj, "Child2");
        
		t1.start();  t2.start();
	}
}