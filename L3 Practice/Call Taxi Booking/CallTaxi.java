import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CallTaxi
{
	String name;
	String place;
	List<Taxi> taxies;
	Point[] point;
	
	public CallTaxi(String name, String place)
	{
		this.name = name;
		this.place = place;
		taxies = new ArrayList<>();
		point = Point.values();
		intiailizerTaxi();
	}
	
	public void intializerTaxi()
	{
		for(int i=0; i<6; i++)
		{
			taxies.add(new Taxi());
		}
	}
	
}
