import java.util.ArrayList;
import java.text.DecimalFormat;

public class Customer implements PurchaseHistory
{
	private String name;
	private Address address;
	private int accountNumber;
	private ArrayList<Product> productList = new ArrayList<Product>();
	

	public Customer(String n, Address a, int an)
	{
		name = n;
		address = a;
		accountNumber = an;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public ArrayList<Product> getProductList()
	{
		return productList;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAddress(Address a)
	{
		address = a;
	}
	
	public void setAccountNumber(int an)
	{
		accountNumber = an;
	}
	
	
	public void addToProductList(Product p)
	{
		productList.add(p);
	}
	
	public String toString()
	{
		return (getName() + "\n" + getAddress() +
			"\nAccount #" + getAccountNumber() + "\n" + getProductList());
	}
	
	public String createHistory()
	{
		Double charge = calculateCharge();
		DecimalFormat df = new DecimalFormat("#.##");
		
		int numberOfMusicProducts = 0;
		int numberOfApps = 0;
		
		for (int i = 0; i < productList.size(); i++)
		{
			if((productList.get(i).getTitle() == "Meet Bach")
				|| (productList.get(i).getTitle() == "Rihanna")
				|| (productList.get(i).getTitle() == "For the Road"))
		numberOfMusicProducts++;
			
			else
				numberOfApps++;
		}
		
		return (name + " " + numberOfMusicProducts + " " + "music products " + numberOfApps + " " + "apps" + " $" + df.format(charge) + "\n");
	}
	
	
	public double calculateCharge()
	{
		Double output = 0.00;
		
		for (int i = 0; i < productList.size(); i++)
		{
			if ((productList.get(i).getTitle() == "Meet Bach")
					|| (productList.get(i).getTitle() == "Rihanna")
					|| (productList.get(i).getTitle() == "For the Road"))
				
				output = output + ((productList.get(i).getPrice()) * ((Music)productList.get(i)).getNumberOfSongsPurchased());
				
			else
				output = output + ((productList.get(i).getPrice()));
				
		}
		
		return output;
	}
	

}