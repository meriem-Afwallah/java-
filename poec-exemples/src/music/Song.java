package music;

public class Song {
	
	private String title;
	private String genre;
	private Person author;
	private int duration;
	
	public Song(String title, String genre, Person author, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}
	
	

}
