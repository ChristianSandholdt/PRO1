package Project1.pigs;

public class DiceThrower {
	// 2 dice with face count of 6 each
	private Die die1;


	// TODO: Add fields.
	// Fields:
	private int rollCount;


	/**
	 * Creates a DiceThrower object.
	 */
	// TODO: Make a constructor that initialises all fields.
	public DiceThrower() {
		die1 = new Die();
		rollCount = 0;
	}

	public int getRollCount() {
		return rollCount;
	}

	/**
	 * Rolls the 2 dice.
	 */
	public void roll() {
		die1.roll();
	}

	/**
	 * Returns the sum of the face values in a roll.
	 */
	public int sum() {
		// TODO
		return die1.getFaceValue();
	}

	/**
	 * Returns a textual description of the roll of the 2 dice.
	 * Example: Returns "(4,5)" for a roll of 4 and 5.
	 */
	public String rollDescription() {
		// TODO: Use the method: String.format().
		return String.format("(%d)",die1.getFaceValue());
	}
}
