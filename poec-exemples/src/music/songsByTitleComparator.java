package music;

import java.util.Comparator;

public class songsByTitleComparator implements Comparator<Song> {

	@Override
	public int compare (Song s1, Song s2) {
		
		
		return s1.getTitle().compareTo(s2.getTitle());
	}
}