import java.util.List;
import java.util.ArrayList;

public class Taxi
{
	int taxiId;
	static int id=3701;
	double earnings;
	Point currentPoint;
	int AvailableTime;
	List<Booking> bookings;
	
	public Taxi()
	{
		this.currentPoint = A;
		this.taxiId = id++;
		this.Avaialable = 6;
		this.earnings = 0;
		this.bookings = new ArrayList<>();
	}
	
	public double calculateEarnings(int distance)
	{
		double baseFare = 100;
		double additionalFare = 10 * Math.max(0, distance-5);
		
		return baseFare+additionalFare;
	}
	
	public void addBookings(Booking booking)
	{
		bookings.add(booking);
	}
}
