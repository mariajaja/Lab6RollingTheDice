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
		int sides;
//		String userStartAgain;
		String userContinueResponse;

		System.out.println("Welcome to the Grand Circus Casino!\n");

		do {

			// allows user input about sides on the die
			System.out.print("How many sides should each die have? ");
			sides = userDiceQuestion.nextInt();

			// implement method to generate random roll
			int diceResultFirst = generateRandomDieRoll(sides);
			int diceResultSecond = generateRandomDieRoll(sides);

			// call method for calling out results of die and special rolls
			System.out.println("First roll: " + diceResultFirst + "\nSecond roll: " + diceResultSecond);

			rollingASpecialCase(diceResultFirst, diceResultSecond);

			// question about rolling again with same amount of sides
			System.out.println("Roll again? (y/n)");
			userContinueResponse = userContinueQuestion.nextLine();

			// add a way to start completely over? maybe
		} while (userContinueResponse.equals("y"));

		userDiceQuestion.close();
		userContinueQuestion.close();
	}

	// method that generates
	private static int generateRandomDieRoll(int sides) {
		Random rand = new Random(); // calls random number generator method
		return rand.nextInt(sides) + 1;
	}

	// creates message if player rolls a special case
	private static void rollingASpecialCase(int diceResultFirst, int diceResultSecond) {
		if (diceResultFirst + diceResultSecond == 7) {
			System.out.println("Congrats! You've rolled a craps!");
		} else if (diceResultFirst == 1 && diceResultSecond == 1) {
			System.out.println("Congrats! You've rolled a pair of snake eyes!");
		} else if (diceResultFirst == 6 && diceResultSecond == 6) {
			System.out.println("Congrats! You've rolled boxcars!");
		} else {
			// blank
		}
	}

}