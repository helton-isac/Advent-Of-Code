package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hitg.adventofcode.Days.Day03;

class Day03Test {

	@Test
	void testManhattanDistance() {
		assertEquals(0, Day03.manhattanDistance(1));
		assertEquals(3, Day03.manhattanDistance(12));
		assertEquals(2, Day03.manhattanDistance(23));
		assertEquals(31, Day03.manhattanDistance(1024));
		//assertEquals(265149, Day03.manhattanDistance(-10));
	}

}
