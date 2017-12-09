package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hitg.adventofcode.Days.Day02;

class Day02Test {

	@Test
	void testCorruptionChecksum() {
		int[][] input = { { 5, 1, 9, 5 }, { 7, 5, 3 }, { 2, 4, 6, 8 } };
		assertEquals(18, Day02.corruptionChecksum(input));
		assertEquals(53978, Day02.corruptionChecksum(Inputs.DAY_02_INPUT));
	}

	@Test
	void testEvenlyDivisibleValues() {
		int[][] input = { { 5, 9, 2, 8 }, { 9, 4, 7, 3 }, { 3, 8, 6, 5 } };
		assertEquals(9, Day02.evenlyDivisibleValues(input));
		assertEquals(314, Day02.evenlyDivisibleValues(Inputs.DAY_02_INPUT));
	}

}
