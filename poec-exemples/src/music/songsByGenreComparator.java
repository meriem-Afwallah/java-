package music;

import java.util.Comparator;

public class songsByGenreComparator implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		
		return s1.getGenre().compareTo(s2.getGenre());
	}
	

}
