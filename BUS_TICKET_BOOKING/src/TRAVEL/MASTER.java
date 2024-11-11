package TRAVEL;
import java.util.*;
public class MASTER 
{
	public static void main(String[] args)
	{
		ArrayList<BUS> Buses = new ArrayList<>();
		ArrayList<BOOKING> Bookings = new ArrayList<>();
		
		Buses.add(new BUS(1,true,59));
		Buses.add(new BUS(2,true,52));
		Buses.add(new BUS(3,true,2));
		
		for(BUS b:Buses)
		{
			b.display();
		}
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		while(ch==1)
		{
			System.out.println("------------");
			System.out.println("Enter 1 to book,2 to exit:");
			ch = sc.nextInt();
			if(ch==1)
			{
				BOOKING book = new BOOKING(sc);
				
				if(book.isavaliable(Buses,Bookings))
				{
					System.out.println("Ticket booked");
					Bookings.add(book);
				}
				else
				{
					System.out.println("No Tickets Avaliable");
				}
			}
		}
		sc.close();
	}
}
