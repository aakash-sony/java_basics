import java.util.Scanner;

public class MainTicket {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Event Name: ");
		String eventName = sc.nextLine();
		
		System.out.println("Enter Seat number: ");
		int seatNumber = sc.nextInt();
		
		System.out.println("Enter Ticket Price: ");
		double ticketPrice = sc.nextDouble();
		
	     Ticket t = new Ticket(eventName, seatNumber, ticketPrice); 
	     System.out.println("Regular Ticket: "+t.toString());
	     
	     t.setEventName("VIP Concert");
	     t.setPrice(200);
	     t.setSeatNumber(16);
	     
	     VIPTicket vt = new VIPTicket(t.getEventName(), t.getSeatNumber(), t.getPrice(), "Backstage Access");
	     System.out.println("VIP Ticket: "+t.toString()+" "+vt.toString());
	     
	     t.setEventName("Student concert");
	     t.setSeatNumber(15);
	     t.setPrice(50);
	     
	     StudentTicket st = new StudentTicket(vt.getEventName(), vt.getSeatNumber(), vt.getPrice(), true);
	     System.out.println("Student Ticket: "+t.toString()+st.toString());

	}

}
