package ba.bitcamp.weekend4.prvidio;

public class SongMain {

	public static boolean isFromSoloAuthor(Song s) {
		if (s.artist.isGroup == true) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isSameArtist(Song s1, Song s2) {
		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		} else {
			return false;
		}
	}

	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.year > s2.year) {
			return s2;
		} else {
			return s1;
		}
	}

	public static void main(String[] args) {

		Song s1 = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Ljubit cu nocas", 2001, "Pop");
		Song s2 = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Bordo majica", 2002, "Pop");

		System.out.println(s1);
		System.out.println();
		System.out.println(s2);

		System.out.println("Authors are same:" + isSameArtist(s1, s2));
		System.out.println("Is solo: " + isFromSoloAuthor(s1));
		System.out.println("Older song" + getOlderSong(s1, s2));

	}

}
