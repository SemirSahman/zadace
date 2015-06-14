package ba.bitcamp.weekend4.prvidio;

public class Concert {

	MusicAutor[] artist;
	Song[] songs;

	public Concert(MusicAutor[] artist, Song[] songs) {
		super();
		this.artist = artist;
		this.songs = songs;
	}

	@Override
	public String toString() {

		String s = "";

		for (int i = 0; i < artist.length; i++) {
			s += "\n" + artist[i] + "\n";
		}

		for (int i = 0; i < songs.length; i++) {
			s += "\n" + songs[i].toString() + "\n";
		}

		return s;
	}
}
