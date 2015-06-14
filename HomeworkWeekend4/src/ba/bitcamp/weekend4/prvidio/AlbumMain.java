package ba.bitcamp.weekend4.prvidio;

public class AlbumMain {

	public static int countGenreNumber(Album a, String genre) {
		int counter = 1;
		for (int i = 0; i < a.songs.length - 1; i++) {
			if (a.songs[i].genre.equals(a.songs[i + 1].genre)) {
				counter++;

			}

		}
		return counter;

	}

	public static void printAlbumInformation(Album[] a, Song s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++)
				if (a[i].songs[j] == s) {
					System.out.println(a[i].albumName);
					return;
				}

		}
		System.out.println("null");

	}

	public static void main(String[] args) {
		MusicAutor a = new MusicAutor("Edvin Po", false, 1997, "Pop");

		Song[] s = new Song[3];
		s[0] = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Ljubit cu nocas", 2001, "Pop");
		s[1] = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Bordo majica", 2002, "Pop");
		s[2] = new Song(new MusicAutor("Edvin Po", false, 1997, "Pop"),
				"Pjesma3", 2002, "Pop");

		Album[] A = new Album[3];
		A[0] = new Album("Neki album1", a, s, "Pop");
		A[1] = new Album("Neki album2", a, s, "Pop");
		A[2] = new Album("Neki album3", a, s, "Pop");

		Album a1 = new Album("Dobar album pravo", a, s, "Pop");

		System.out.println("Number of songs with same genre is: "
				+ countGenreNumber(a1, "Pop"));

		printAlbumInformation(A, s[0]);

	}
}