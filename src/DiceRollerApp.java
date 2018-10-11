import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class DiceRollerApp {

	/**
	 * Ask user how many sides they want their dice to have, prompt user to roll
	 * dice and display the results of the rolls. After, user will be asked if they
	 * want to play again.
	 */

	public static void main(String[] args) {
		Scanner userContinueQuestion = new Scanner(System.in);
		Scanner userDiceQuestion = new Scanner(System.in);
		int userDiceDecision;
//		String userStartAgain;
		String userContinueResponse;

		System.out.println("Welcome to the Grand Circus Casino!\n");

		do {
			Random rand = new Random(); // creates random number generator

			// allows user input about sides on the die
			System.out.print("How many sides should each die have?");
			userDiceDecision = userDiceQuestion.nextInt();

			// implement method to generate random roll
			int diceResultFirst = rand.nextInt(userDiceDecision) + 1;
			int diceResultSecond = rand.nextInt(userDiceDecision) + 1;

			// call method for calling out results of di and special rolls

			// question about rolling again with same amount of sides
			System.out.println("Roll again? (y/n)");
			userContinueResponse = userContinueQuestion.nextLine();

			// add a way to start completely over? maybe
		} while (userContinueResponse.equals("y"));
	}

	// create method to generate random numbers for the rolls
	// create method if user got craps, snake eyes and box cars
	// google what those^ are
}
