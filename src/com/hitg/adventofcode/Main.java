package com.hitg.adventofcode;

import com.hitg.adventofcode.Days.Day01;
import com.hitg.adventofcode.Days.Day02;
import com.hitg.adventofcode.Days.Day03;
import com.hitg.adventofcode.Days.Day04;
import com.hitg.adventofcode.Days.Inputs;

public class Main {
	public static void main(String[] args) {
		(new Day01(Inputs.DAY_01_INPUT)).printPuzzleAnswer();
		(new Day02(Inputs.DAY_02_INPUT)).printPuzzleAnswer();
		day03();
		day04();
	}

	static void day03() {
		int day03Input = 265149;
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 3");
		System.out.println("First puzzle input: " + day03Input);
		System.out.println("Part 1");
		System.out.println("First captcha: " + Day03.manhattanDistance(day03Input));
		System.out.println("Part 2");
		System.out.println("Second captcha: " + "Day01.blblbl(day03Input)");
	}	
	
	static void day04() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 4");
		System.out.println("First puzzle input: To Long...");
		System.out.println("Answer Part 1: " + Day04.validPassPhrases(Day04.input));
		System.out.println("Answer Part 2: " + Day04.validPassPhrasesAnagram(Day04.input));
	
	}
}
