package Project1.craps;

import java.util.Random;

public class Die {
	// number of faces
	private int faceCount;
	// value of upper face
	private int faceValue;

	private Random rd = new Random();

	/**
	 * Creates a die with the given face count and a random face value.
	 */
	public Die(int faceCount) {
		this.faceCount = faceCount;
		faceCount = 6;
	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	public Die() {
		faceCount = 6;
		faceValue = 1 + rd.nextInt(6);
	}

	public int getFaceValue(){
		return faceValue;
	}

	public int getFaceCount(){
		return faceCount;
	}

	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		faceValue = 1 + rd.nextInt(faceCount);
	}


}