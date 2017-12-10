package com.hitg.adventofcode;

import com.hitg.adventofcode.Days.*;

public class Main {
	public static void main(String[] args) {
		int day = 1;
		AbstractDay dayPuzzle = null;
		while((dayPuzzle = getPuzzleDay(day++)) != null) {
			dayPuzzle.printPuzzleAnswer();
		}
	}

	private static AbstractDay getPuzzleDay(int day) {
		switch (day) {
		case 1:
			return new Day01(Inputs.DAY_01_INPUT);
		case 2:
			return new Day02(Inputs.DAY_02_INPUT);
		case 3:
			return new Day03(Inputs.DAY_03_INPUT);
		case 4:
			return new Day04(Inputs.DAY_04_INPUT);
		case 5:
			return new Day05(Inputs.DAY_05_INPUT);
		case 6:
			return new Day06(Inputs.DAY_06_INPUT);			
		default:
			return null;
		}
	}

}
