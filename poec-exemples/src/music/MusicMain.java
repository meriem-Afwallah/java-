package music;

import java.util.List;

public class MusicMain {

	public static void main(String[] args) {
		
		Person person1 = new Person("nom","prenom");
		Person person2 = new Person("nom","prenom");
		Person person3 = new Person("nom","prenom");
		
		Song song1 = new Song("titre1", "genre1",person1,120);
		Song song2 = new Song("titre2", "genre2",person2,190);
		Song song3 = new Song("titre3", "genre3",person3,170);
		
		PlayList playList = new PlayList();
		playList.add(song1);
		playList.add(song2);
		playList.add(song3);
		
		
		List<Song> songOrderedByTitle = playList.songsByTitle();
		List<Song> songOrderedByGenre = playList.songsByGenre();
		List<Song> songOrderedByDuration = playList.songsByDuration();
		List<Song> songOrderedByAuthorName = playList.songsByAuthorName();
		
		// "bonjour".compareTo("le monde")

	}

}
