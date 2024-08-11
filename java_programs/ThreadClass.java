class Stuff extends Thread
{
	@Override
	public void run() 
	{		
		System.out.println("Child Thread is Running!!!!");
	}	
}
public class ThreadClass 
{
	public static void main(String[] args) 
	{		
		System.out.println("Main Thread Started");		
		
		Stuff s1 = new Stuff(); 
		Stuff s2 = new Stuff(); 
		
		
		s1.start();
		s2.start();
		
		System.out.println(10/0);
		
		System.out.println("Main Thread Ended");
	}

}