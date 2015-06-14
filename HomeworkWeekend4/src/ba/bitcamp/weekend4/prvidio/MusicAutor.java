package ba.bitcamp.weekend4.prvidio;

public class MusicAutor {

	String name;
	Boolean isGroup;
	int year;
	String musicGenre;

	public MusicAutor(String name, Boolean isGroup, int year, String musicGenre) {
		super();
		this.name = name;
		this.isGroup = isGroup;
		this.year = year;
		this.musicGenre = musicGenre;
	}

	@Override
	public String toString() {

		String s = "";
		s += "Name: " + name + "\n";
		s += "Is group: " + isGroup + "\n";
		s += "Started career: " + year + "\n";
		s += "Music genre: " + musicGenre + "\n";

		return s;
	}
}