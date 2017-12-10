package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day06Test {

	@Test
	void test() {
		int[] input = {0,2,7,0};
		Day06 day06 = new Day06(input);
		assertEquals("5", day06.getPart1Answer());
		assertEquals("4", day06.getPart2Answer());
		
		day06 = new Day06(Inputs.DAY_06_INPUT);
		assertEquals("14029", day06.getPart1Answer());
		assertEquals("2765", day06.getPart2Answer());
	}

}
