package ba.bitcamp.weekend4.prvidio;

public class Album {

	String albumName;
	MusicAutor artist;
	Song[] songs;
	String albumGenre;

	public Album(String albumName, MusicAutor artist, Song[] songs,
			String albumGenre) {
		super();
		this.albumName = albumName;
		this.artist = artist;
		this.songs = songs;
		this.albumGenre = albumGenre;
	}

	@Override
	public String toString() {

		String s = " ";
		s += "Album name: " + albumName + "\n";
		s += "Artist: " + artist + "\n";
		s += "Album genre: " + albumGenre + "\n";

		for (int i = 0; i < songs.length; i++) {
			s += "\n" + songs[i].toString() + "\n";
		}

		return s;
	}
}
