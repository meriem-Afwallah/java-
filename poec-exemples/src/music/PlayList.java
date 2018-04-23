package music;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayList  {
	
	private	ArrayList<Song> songs;
	
	public PlayList() {
		songs =  new ArrayList<Song>();
	}

	public void add(Song song) {
		songs.add(song);
	}

	public List<Song> songsByTitle() {
		songsByTitleComparator comparator = new songsByTitleComparator();
		songs.sort(comparator);
		
		return songs;
	}

	public List<Song> songsByGenre() {
		songsByGenreComparator comparator = new songsByGenreComparator();
		songs.sort(comparator);
		return songs;
	}

	public List<Song> songsByDuration() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Song> songsByAuthorName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
