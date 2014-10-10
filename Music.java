public class Music extends Product
{
	public enum GenreType {CLASSICAL, ROCK, COUNTRY};
	private GenreType genre = GenreType.CLASSICAL;
	private String artist;
	private int numberOfSongsPurchased;
	
	public Music(String t, Double p, Date pd, GenreType gt, String a, int nosp)
	{
		super(t,p,pd);
		genre = gt;
		artist = a;
		numberOfSongsPurchased = nosp;
	}
	
	public GenreType getGenreType()
	{
		return genre;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public int getNumberOfSongsPurchased()
	{
		return numberOfSongsPurchased;
	}
	
	public void setGenreType(GenreType gt)
	{
		genre = gt;
	}
	
	public void setArtist(String a)
	{
		artist = a;
	}
	
	public void setNumberOfSongsPurchased(int nosp)
	{
		numberOfSongsPurchased = nosp;
	}
	
	public String toString()
	{
		return (super.toString() + getGenreType() + ", " + getArtist() +
			", " + getNumberOfSongsPurchased() + "\n");
	}
}