package com.hitg.adventofcode;

public class Day01 {

	public static int inverseCaptcha(String input) {
		return inverseCaptcha(input, 1);
	}

	public static int inverseCaptchaHalfWay(String input) {
		return inverseCaptcha(input, input.length() / 2);
	}

	private static int inverseCaptcha(String input, int steps) {
		int sum = 0;
		if (input != null) {
			char[] charArray = input.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				int indexToCompare = (i + steps) % charArray.length;
				if (i != indexToCompare && charArray[i] == charArray[indexToCompare]) {
					sum += Character.getNumericValue(charArray[i]);
				}
			}
		}
		return sum;
	}
}



