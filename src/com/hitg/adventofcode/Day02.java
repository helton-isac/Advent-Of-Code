package com.hitg.adventofcode;

public class Day02 {

	public static Object corruptionChecksum(int[][] input) {
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

	public static Object evenlyDivisibleValues(int[][] input) {
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

}
