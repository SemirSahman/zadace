package ba.bitcamp.weekend4.drugidio;

public class Book {
	private String name;
	private Integer year;
	private String genre;
	private Boolean isBestseller;

	// Generating get and set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Boolean getIsBestseller() {
		return isBestseller;
	}

	public void setIsBestseller(Boolean isBestseller) {
		this.isBestseller = isBestseller;
	}

	// Generating constructor
	public Book(String name, Integer year, String genre, Boolean isBestseller) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}

	// Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Name of book: " + name + "\n";
		s += "Year: " + year + "\n";
		s += "Genre: " + genre + "\n";
		s += "Is bestseller: " + isBestseller + "\n";
		return s;
	}

}