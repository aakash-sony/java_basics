
class Priority                        
{
	public void accept()
	{
		int count =0;
		for(int i=1; i<=100000; i++)
		{
			count++;
		}
		
		System.out.println("After completion name of the Thread is :"+Thread.currentThread().getName());
		System.out.println("After completion Priority of the Thread is :"+Thread.currentThread().getPriority());
	}
}


public class PriorityDemo1 {

	public static void main(String[] args)
	{
		Priority p = new Priority();
		
		Runnable r1 = ()-> p.accept();
		
		Thread t1 = new Thread(r1,"LastThread");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		Thread t2 = new Thread(r1,"FirstThread");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start(); t2.start();

	}

}