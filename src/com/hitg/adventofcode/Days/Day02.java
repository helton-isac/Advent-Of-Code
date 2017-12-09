package com.hitg.adventofcode.Days;

/**
 * http://adventofcode.com/2017/day/2
 * 
 * --- Day 2: Corruption Checksum ---
 * 
 * @author Helton Isac
 *
 */
public class Day02 extends AbstractDay{

	/**
	 * Default Constructor.
	 * 
	 * @param input
	 *            Input object to the problems.
	 */
	public Day02(Object input) {
		super(input);
	}

	public static int corruptionChecksum(int[][] input) {
		int currentMinValue = Integer.MAX_VALUE;
		int currentMaxValue = 0;
		int checkSum = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				currentMinValue = Math.min(currentMinValue, input[i][j]);
				currentMaxValue = Math.max(currentMaxValue, input[i][j]);
			}
			checkSum += (currentMaxValue - currentMinValue);
			currentMinValue = Integer.MAX_VALUE;
			currentMaxValue = 0;
		}
		return checkSum;
	}

	public static int evenlyDivisibleValues(int[][] input) {
		int checkSum = 0;
		for (int i = 0; i < input.length; i++) {
			int currentSum = 0;
			for (int j = 0; j < input[i].length && currentSum == 0; j++) {
				for (int jj = j + 1; jj < input[i].length && currentSum == 0; jj++) {
					if (input[i][j] % input[i][jj] == 0) {
						currentSum = input[i][j] / input[i][jj];
					} else if (input[i][jj] % input[i][j] == 0) {
						currentSum = input[i][jj] / input[i][j];
					}
				}
			}
			checkSum += currentSum;
		}
		return checkSum;
	}

	@Override
	public String getChallengeName() {
		return "--- Day 2: Corruption Checksum ---";
	}

	@Override
	public String getPart1Answer() {
		return String.valueOf(corruptionChecksum((int[][]) this.input));
	}

	@Override
	public String getPart2Answer() {
		return String.valueOf(evenlyDivisibleValues((int[][]) this.input));
	}

	@Override
	public String inputToString() {
		StringBuilder sb = new StringBuilder();
		int[][] castInput = (int[][]) this.input;
		
		for (int i = 0; i < castInput.length; i++) {
			for (int j = 0; j < castInput[i].length; j++) {
				sb.append(String.format("%1$" + 6 + "s", castInput[i][j]));
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
