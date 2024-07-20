class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<=3; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class NewPlatForm3
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.start();
                Test t2= new Test();
		t.start();
	}
}
      