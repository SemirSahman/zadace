package ba.bitcamp.weekend4.drugidio;

public class FootballMain {

	/**
	 * Method which return youngest player in team
	 * 
	 * @param t
	 *            - Looking team
	 * @return - Youngest player at team
	 */
	public static FootballPlayer getYoungestPlayer(FootballTeam t) {
		int min = t.player[0].yearOfBirth;
		FootballPlayer youngest = t.player[0];
		for (int i = 1; i < t.player.length; i++) {
			if (t.player[i].yearOfBirth > min) {
				min = t.player[i].yearOfBirth;
				youngest = t.player[i];
			}
		}
		return youngest;

	}

	/**
	 * Calculated number of player at same position
	 * 
	 * @param t
	 *            - Array of team
	 * @param position
	 *            - Checking position
	 * @return - Number of same position
	 */
	public static int countPlayers(FootballTeam t, String position) {
		int counter = 0;
		for (int i = 0; i < t.player.length; i++) {
			if (t.player[i].position.equals(position)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Method which calculated number of player same of year of birth
	 * 
	 * @param t
	 *            - Class team
	 * @param year
	 *            - Integer testing year
	 * @return - Number of same year player
	 */
	public static int countPlayers(FootballTeam t, int year) {
		int counter = 0;
		for (int i = 0; i < t.player.length; i++) {
			if (t.player[i].yearOfBirth == year) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		// Declaration of players to team one
		FootballPlayer[] team1 = new FootballPlayer[8];
		team1[0] = new FootballPlayer("Dzeko", 1980, "Forward");
		team1[1] = new FootballPlayer("Lulic", 1979, "Midfield");
		team1[2] = new FootballPlayer("Pjanic", 1988, "Midfield");
		team1[3] = new FootballPlayer("Spahic", 1980, "Deffender");
		team1[4] = new FootballPlayer("Begovic", 1987, "Goalkepeer");
		team1[5] = new FootballPlayer("Barbarez", 1978, "Forward");
		team1[6] = new FootballPlayer("Misimovic", 1980, "Midfield");
		team1[7] = new FootballPlayer("Visca", 1987, "Forward");

		// Declaration team one with players and team name
		FootballTeam t1 = new FootballTeam("BiH", team1);

		// Declaration of players to team two
		FootballPlayer[] team2 = new FootballPlayer[8];
		team2[0] = new FootballPlayer("Benko", 1981, "Forward");
		team2[1] = new FootballPlayer("Stojcev", 1979, "Midfield");
		team2[2] = new FootballPlayer("Cimirot", 1995, "Midfield");
		team2[3] = new FootballPlayer("Tatomirovic", 1981, "Deffender");
		team2[4] = new FootballPlayer("Delac", 1991, "Goalkepeer");
		team2[5] = new FootballPlayer("Velkoski", 1987, "Forward");
		team2[6] = new FootballPlayer("Radovac", 1996, "Midfield");
		team2[7] = new FootballPlayer("Duljevic", 1993, "Forward");

		// Declaration team two with players and team name
		FootballTeam t2 = new FootballTeam("FK Sarajevo", team2);

		// Calculated number of same year of birth with method
		System.out.print("Number of players with same year of birth: ");
		System.out.println(countPlayers(t1, 1987));

		// Calculated number of same position with method
		System.out.print("Number of players at same position: ");
		System.out.println(countPlayers(t1, "Forward"));

		// Finding youngest player at team with method
		System.out.print("Youngest player from team   ");
		System.out.println(getYoungestPlayer(t2));
	}

}