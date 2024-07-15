class Customer implements Runnable
{
   private int availableSeat = 1;
   private int wantedSeat;
   
   public Customer(int wantedSeat)
   {
	   this.wantedSeat = wantedSeat;
   }
   
	@Override
	public  void run() 
	{
		String name = null;
		
		if(availableSeat >= wantedSeat)
		{
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat+" seat is reserved for "+name);
			availableSeat = availableSeat - wantedSeat;
				
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" seat is not available");
		}
		
				
	}
	
}

public class RailwayReservation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Customer cust = new Customer(1);		
		
		Thread t1 = new Thread(cust,"Virat");				
		Thread t2 = new Thread(cust,"Rohit");
		
		t1.start(); t2.start();	
		
	}

}
