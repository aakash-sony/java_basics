public class Movie 
{
	private String title;
	private int releaseYear;
	private String genration;
	public Movie(String title, int releaseYear, String genration) 
	{
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.genration = genration;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getGenration() {
		return genration;
	}
	public void setGenration(String genration) {
		this.genration = genration;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", releaseYear=" + releaseYear + ", genration=" + genration + "]";
	}
	
	
}
