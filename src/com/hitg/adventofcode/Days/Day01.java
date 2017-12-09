package com.hitg.adventofcode.Days;

import java.security.InvalidParameterException;

/**
 * http://adventofcode.com/2017/day/1
 * 
 * --- Day 1: Inverse Captcha ---
 * 
 * @author Helton Isac
 *
 */
public class Day01 extends AbstractDay {

	/**
	 * Default Constructor.
	 * 
	 * @param input
	 *            Input object to the problems.
	 */
	public Day01(Object input) {
		super(input);
	}

	/**
	 * Review a sequence of digits and find the sum of all digits that match the
	 * next digit in a circular list.
	 * 
	 * @param digits
	 *            A String representing a sequence of digits.
	 * @return The sum of all digits that match the next digit
	 */
	private int inverseCaptcha(String digits) {
		return inverseCaptcha(digits, 1);
	}

	/**
	 * Review a sequence of digits and find the sum of all digits that match the
	 * next digit halfway around the circular list.
	 * 
	 * @param digits
	 *            A String representing a sequence of digits with an even number of
	 *            elements.
	 * @return The sum of all digits that match the next digit halfway around the
	 *         circular list.
	 */
	private int inverseCaptchaHalfWay(String digits) {
		if ((digits.length() & 1) == 1) {
			throw new InvalidParameterException();
		}
		return inverseCaptcha(digits, digits.length() / 2);
	}

	/**
	 * Review a sequence of digits and find the sum of all digits that match the
	 * next digit after x steps in a circular list.
	 * 
	 * @param digits
	 *            A String representing a sequence of digits with.
	 * @param steps
	 *            Steps to considering in the String digit sum.
	 * @return The sum of all digits that match the next digit after x steps around
	 *         the circular list.
	 */
	private int inverseCaptcha(String digits, int steps) {
		int sum = 0;
		if (digits != null) {
			char[] charArray = digits.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				int indexToCompare = (i + steps) % charArray.length;
				if (i != indexToCompare && charArray[i] == charArray[indexToCompare]) {
					sum += Character.getNumericValue(charArray[i]);
				}
			}
		}
		return sum;
	}

	@Override
	public String getPart1Answer() {
		return String.valueOf((inverseCaptcha(this.input.toString())));
	}

	@Override
	public String getPart2Answer() {
		return String.valueOf((inverseCaptchaHalfWay(this.input.toString())));
	}

	@Override
	public String getChallengeName() {
		return "Day 1: Inverse Captcha";
	}

	@Override
	public String inputToString() {
		return this.input.toString();
	}
}
