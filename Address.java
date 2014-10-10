//Jonathan Cuellar Group 17

public class Address
{
	private String street;
	private String city;
	private String state;
	private int zip;

	public Address (String st, String c, String s, int z)
	{
		street = st;
		city = c;
		state = s;
		zip = z;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZip()
	{
		return zip;
	}
	
	public void setStreet( String st)
	{
		street = st;
	}
	
	public void setCity( String c)
	{
		city = c;
	}
	
	public void setState( String s)
	{
		state = s;
	}
	
	public void setZip( int z)
	{
		zip = z;
	}
	
	public String toString()
	{
		return (getStreet() + ", " + getCity() + 
			", " + getState() + " " + getZip());
	}
}
