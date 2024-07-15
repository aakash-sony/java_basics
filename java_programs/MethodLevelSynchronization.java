class Table
{
	public synchronized void printTable(int num)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(num +" X "+i+" = "+(num*i));
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("...............");
	}
}


public class MethodLevelSynchronization {

	public static void main(String[] args) 
	{
		Table obj = new Table();  //lock is created
		
		Runnable r1 = ()-> obj.printTable(5);
		Runnable r2 = ()-> obj.printTable(10);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start(); t2.start();

	}

}