package ba.bitcamp.weekend4.prvidio;

public class ConcertMain {

	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int[] array = new int[a.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			counter = 0;
			for (int j = 0; j < a[i].songs.length; j++) {
				for (int k = 0; k < c.songs.length; k++) {
					if (c.songs[k].name == a[i].songs[j].name) {
						counter++;
					}
				}
			}
			array[i] = counter;
		}
		return array;

	}

	public static int getMaxNumbersOfSongs(Concert c) {
		int counter = 0;
		MusicAutor mostAppeared = c.artist[0];
		int tmp = 0;
		for (int i = 0; i < c.artist.length; i++) {
			for (int j = i; j < c.artist.length; j++) {
				if (mostAppeared.name == c.artist[j].name) {
					tmp++;
				}
			}
			if (counter < tmp) {
				mostAppeared = c.artist[i];
				counter = tmp;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		MusicAutor[] a = new MusicAutor[3];
		a[0] = new MusicAutor("Edvin Po", false, 1997, "Pop");
		a[1] = new MusicAutor("Umek", false, 1993, "Techno");
		a[2] = new MusicAutor("The Notorious B.I.G.", false, 1992, "Rap");

		Song[] s = new Song[3];
		s[0] = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Ljubit cu nocas", 2001, "Pop");
		s[1] = new Song(new MusicAutor("Umek", false, 1993, "Techno"),
				"Lanicor", 2005, "Techno");
		s[2] = new Song(new MusicAutor("The Notorious B.I.G.", false, 1992,
				"Rap"), "Notorious thugs", 1995, "Rap");

		Album[] A = new Album[3];
		A[0] = new Album("Neki album1", a[0], s, "Pop");
		A[1] = new Album("Neki album2", a[1], s, "Techno");
		A[2] = new Album("Neki album3", a[2], s, "Rap");

		Concert c1 = new Concert(a, s);

		System.out.println("Number of songs from album that was in concert: "
				+ getNumberOfSongsPerAlbum(c1, A));
		System.out
				.println("Maximum number of songs that was played by one artist: "
						+ getMaxNumbersOfSongs(c1));

	}
}
