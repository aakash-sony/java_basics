class DoStuff extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running Here!!!!");
	}
}
public class ThreadName2 
{
	public static void main(String[] args) 
	{
		DoStuff t1 = new DoStuff(); 
		DoStuff t2 = new DoStuff(); 
		
				
		t1.start();			
		t2.start();	
		
	System.out.println(Thread.currentThread().getName()+" thread is running.....");
	}
}
