class JavaClass implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=3; i++)
		{
			System.out.println(i+" by "+name);
		}
	}
	
}

public class ThreadGroupDemo2 
{

	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("Java_Group");
		
		Thread t1 = new Thread(tg, new JavaClass(), "Child 1" );
		Thread t2 = new Thread(tg, new JavaClass(), "Child 2" );
		t1.start();
		t2.start();
		
		
		
		System.out.println("Thread group name is :"+tg.getName());
		System.out.println("Total threads which are Running in this group :"+tg.activeCount());

	}

}