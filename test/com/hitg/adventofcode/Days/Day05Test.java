package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day05Test {

	@Test
	void test() {
		int[] input = {0,3,0,1,-3};
		Day05 day05 = new Day05(input);
		assertEquals("5", day05.getPart1Answer());
		assertEquals("10", day05.getPart2Answer());
		
		day05 = new Day05(Inputs.DAY_05_INPUT);
		assertEquals("381680", day05.getPart1Answer());
		assertEquals("29717847", day05.getPart2Answer());
	}

}

