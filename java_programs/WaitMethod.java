public class WaitMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Wait Method");
		Object obj = new Object();
	    obj.wait();
	}

}