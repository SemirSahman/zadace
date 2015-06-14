package ba.bitcamp.weekend4.drugidio;

public class FootballPlayer {

	public String name;
	public Integer yearOfBirth;
	public String position;

	// Constructor for player
	public FootballPlayer(String name, Integer yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}

	// Method toString for output of player
	@Override
	public String toString() {
		return " \n Player name is " + name + ". \n Year of birth is "
				+ yearOfBirth + ". \n Position is " + position + "";
	}

}