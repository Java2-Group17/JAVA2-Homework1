public class App extends Product
{
	public enum AppType {GAME, PRODUCTIVITY, EDUCATION}
	private AppType gameType = AppType.GAME;
	private String developer;
	
	public App(String t, double p, Date pd, AppType at, String d)
	{
		super(t,p,pd);
		gameType = at;
		developer = d;
	}
	
	public AppType getGameType()
	{
		return gameType;
	}
	
	public String getDeveloper()
	{
		return developer;
	}
	
	public void setAppType(AppType at)
	{
		gameType = at;
	}
	
	public void setDeveloper(String d)
	{
		developer = d;
	}
	
	public String toString()
	{
		return (super.toString() + " " + getGameType() + ", " + getDeveloper() + ("\n"));
	}
	
}