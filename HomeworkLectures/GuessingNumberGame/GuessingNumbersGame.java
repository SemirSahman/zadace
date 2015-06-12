package ba.bitcamp.week4.day3.vjezbe;
import java.util.Scanner;

public class GuessingNumbersGame {

	
	public static Scanner input = new Scanner(System.in);
	
	public static int guesses = 4;
	
	public static int wins = 0;
	
	public static int loses = 0;
	
	public static int gamesPlayed = 0;

	/**
	 * Starts program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		startGame();
		printScore();
	}
	
	/**
	 * Starts game.
	 */
	public static void startGame(){
		System.out.println("Guess number from 1 to 100.");
		boolean playMore = true;
		while (playMore) {
			int randomNum = getRandomNumber();
			playOneGame(randomNum, guesses);
			playMore = playmore();
			gamesPlayed++;
		}
		
	}
	
	/**
	 * Takes user input from console and returns true if user wants to play more.
	 * @return True if user wants another game.
	 */
	public static boolean playmore(){
		int more = 0;
		System.out.println("If you want to play more, input 1.");
		System.out.println("To exit, input anything else.");
		more = input.nextInt();
		if(more == 1){
			return true;
		}
		return false;
	}

	/**
	 * Returns random number of type int in range from 1 to 100.
	 * @return A random number.
	 */
	public static int getRandomNumber() {
		return (int)(Math.random() * 100.0 + 1.0);
	}

	/**
	 * Plays one round of Guessing number game, and prints results.
	 * @param num Target number.
	 * @param numOfGuesses Number of guesses allowed.
	 */
	public static void playOneGame(int num, int numOfGuesses) {
		int guess = 0;
		while (numOfGuesses > 0) {
			System.out.print("Guess number: ");			
			guess = input.nextInt();
			if (guess == num){
				System.out.println("Congratulations!");
				System.out.println("Searched number was " + num + "!");
				wins++;
				break;
			}
			isBigger(num, guess);
			numOfGuesses--;
		}
		if(numOfGuesses == 0){
			System.out.println("Better luck next time.");
			System.out.println("Searched number was " + num + "!");
			loses++;
		}
	}

	/**
	 * Prints on console if num parameter is bigger or smaller than guess parameter.
	 * @param num A number
	 * @param guess Another number
	 */
	public static void isBigger(int num, int guess) {
		if (num > guess) {
			System.out.println("Number is bigger than guess.");
			return;
		} 
		System.out.println("Number is smaller than guess.");	
	}

	/**
	 * Prints score on console.
	 */
	public static void printScore() {
		System.out.println("You played " + gamesPlayed + " games.");
		System.out.println("Wins:   " + wins);
		System.out.println("Loses:  " + loses);
		
	}
}