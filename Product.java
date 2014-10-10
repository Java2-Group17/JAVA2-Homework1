public abstract class Product
{
	private String title;
	private Double price;
	private Date purchaseDate;
	
	public Product(String t, double p, Date pd)
	{
		title = t;
		price = p;
		purchaseDate = pd;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public Date getPurchaseDate()
	{
		return purchaseDate;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public void setPurchaseDate(Date pd)
	{
		purchaseDate = pd;
	}
	
	public String toString()
	{
		return (getTitle() + ", " + getPrice() +
			", " + getPurchaseDate());
	}
	
	
	
}