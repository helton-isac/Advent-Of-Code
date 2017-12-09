package com.hitg.adventofcode.Days;

/**
 * Abstract class used to
 * 
 * @author Helton Isac
 *
 */
public abstract class AbstractDay {

	/**
	 * Input object to be used to solve the problems.
	 */
	protected Object input;

	/**
	 * Abstract Constructor.
	 * 
	 * @param input
	 *            Input object to the problems.
	 */
	public AbstractDay(Object input) {
		this.input = input;
	}

	/**
	 * Gets the Challenge Name.
	 * 
	 * @return The Challenge Name.
	 */
	public abstract String getChallengeName();

	/**
	 * Get the answer to the first problem of the Day.
	 * 
	 * @param input
	 *            Input object to the first Problem.
	 * @return Returns the answer of the first Problem converted to String.
	 */
	public abstract String getPart1Answer();

	/**
	 * Get the answer to the second problem of the Day.
	 * 
	 * @param input
	 *            Input object to the second Problem.
	 * @return Returns the answer of the second Problem converted to String.
	 */
	public abstract String getPart2Answer();

	/**
	 * Convert properly the input to String.
	 * 
	 * @return Returns a properly representation of the input to String.
	 */
	public abstract String inputToString();

	/**
	 * Print the puzzle name, input and answers on the console.
	 */
	public void printPuzzleAnswer() {
		System.out.println();
		System.out.println("==================================================");
		System.out.println();
		System.out.println(this.getChallengeName());
		System.out.println();
		System.out.println("input: " + this.inputToString());
		System.out.println();
		System.out.println("Part One Answer: " + this.getPart1Answer());
		System.out.println("Part Two Answer: " + this.getPart2Answer());
		System.out.println();
	}

}
