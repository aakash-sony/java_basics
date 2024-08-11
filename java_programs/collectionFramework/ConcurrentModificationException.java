import java.util.ArrayList;
import java.util.Iterator;
class Concurrent extends Thread
{
	ArrayList<String> arl = null;

	public Concurrent(ArrayList<String> arl)
	{
		super();
		this.arl = arl;
	}	
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		arl.add("Goa");
	}	
}

public class ConcurrentModificationException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<String> listOfCity = new ArrayList<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");
		
        Concurrent cc = new Concurrent(listOfCity);
        cc.start();
        
        Iterator<String> itr = listOfCity.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        	Thread.sleep(500);
        }	
	}
}