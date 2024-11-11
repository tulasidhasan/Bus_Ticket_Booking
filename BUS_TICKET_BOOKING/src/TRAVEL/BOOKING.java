package TRAVEL;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class BOOKING 
{
	String name;
	int busno;
	Date date;
	
	BOOKING(Scanner sc)
	{
		System.out.println("Name of the passanger:");
		name = sc.next();
		System.out.println("Bus no:");
		busno = sc.nextInt();
		System.out.println("Enter the date(dd-mm-yyyy):");
		String aw = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		try
		{
			date=sdf.parse(aw);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public boolean isavaliable(ArrayList<BUS> Buses,ArrayList<BOOKING> Bookings) 
		{
			int booked =0;
			int capacity=0;
			for(BUS bb:Buses)
			{
				if(bb.get_bno()==busno)
				{
					capacity = bb.get_cap();
				}
			}
			for(BOOKING aa : Bookings)
			{
				if(aa.busno==busno && aa.date.equals(date))
				{
					booked++;
				}
			}
			return booked<capacity;
		}
}
