package ba.bitcamp.weekend4.drugidio;

import java.util.Arrays;

public class FootballTeam {

	public String name;
	public FootballPlayer[] player;

	// Constructor for team
	public FootballTeam(String name, FootballPlayer[] player) {
		super();
		this.name = name;
		this.player = player;
	}

	// Method toString for output for team
	@Override
	public String toString() {
		return "Team name is " + name + ". \n " + Arrays.toString(player) + ".";
	}

}