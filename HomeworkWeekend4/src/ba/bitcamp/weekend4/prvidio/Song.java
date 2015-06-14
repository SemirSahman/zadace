package ba.bitcamp.weekend4.prvidio;

public class Song {

	MusicAutor artist;
	String name;
	int year;
	String genre;

	public Song(MusicAutor artist, String name, int year, String genre) {
		super();
		this.artist = artist;
		this.name = name;
		this.year = year;
		this.genre = genre;
	}

	@Override
	public String toString() {

		String s = "";
		s += "Music autor: " + artist + "\n";
		s += "Song name: " + name + "\n";
		s += "Song released: " + year + "\n";
		s += "Song genre: " + genre + "\n";

		return s;
	}
}