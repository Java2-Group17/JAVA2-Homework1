public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date (int m, int d, int y)
	{
		month = m;
		day = d;
		year = y;
	}
	
	int getMonth()
	{
		return month;
	}
	
	int getDay()
	{
		return day;
	}
	
	int getYear()
	{
		return year;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public String toString()
	{
		return (" " + getMonth() + "/" + getDay() + 
			"/" + getYear() + "\n" );
	}
}