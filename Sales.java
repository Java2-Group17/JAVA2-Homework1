import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sales
{
	public static void main(String[] args)
	{
		String message = "";
		ArrayList<Customer> customerArray = new ArrayList<Customer>();
		Customer c1 = new Customer("Davis ", 
			new Address("Cooper Street", "Arlington",  "Texas", 76019), 
			65783);
		Customer c2 = new Customer("Jones",
			new Address("Fifth Street", "Dallas", "Texas", 76000),
			11123);
		
		
		c1.addToProductList(new Music("Meet Bach", 0.99,
			new Date(1, 5, 2010), 
			Music.GenreType.CLASSICAL, "Bach", 5 ));
		c1.addToProductList(new Music("Rihanna", 1.29,
			new Date(6,5,2010),
			Music.GenreType.ROCK, "Rihanna", 8 ));
		c1.addToProductList(new App("Tennis", 9.99,
			new Date(3,18,2010),
			App.AppType.GAME, "Ubisoft"));
		
		customerArray.add(c1);
		
		c2.addToProductList(new Music( "For the Road", .99,
			new Date(2,8,2010),
			Music.GenreType.COUNTRY, "Swift", 12));
		c2.addToProductList(new App("Learn Java", 5.99,
			new Date(9,1,2010),
			App.AppType.EDUCATION, "Adobe"));
		c2.addToProductList(new App("Pages", 9.99,
			new Date(5,30,2010),
			App.AppType.PRODUCTIVITY, "Apple"));
		
		customerArray.add(c2);
		
		
		
		for(Customer c: customerArray)
		{
			message += c.createHistory();
		}
		
		JOptionPane.showMessageDialog(null, message, "Purchase History", JOptionPane.PLAIN_MESSAGE);
		
	}
}