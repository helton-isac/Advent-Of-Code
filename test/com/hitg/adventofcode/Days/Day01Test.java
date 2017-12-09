package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Day01Test {

	@Test
	void testPartOne() {
		Map<String, String> testsMap = new HashMap<>();
		testsMap.put("1122", "3");
		testsMap.put("11221", "4");
		testsMap.put("1111", "4");
		testsMap.put("1234", "0");
		testsMap.put("91212129", "9");
		testsMap.put(Inputs.DAY_01_INPUT, "1102");

		for (String key : testsMap.keySet()) {
			Day01 day01 = new Day01(key);
			assertEquals(testsMap.get(key), day01.getPart1Answer());
		}
	}

	@Test
	void testPartTwo() {
		Map<String, String> testsMap = new HashMap<>();
		testsMap.put("1212", "6");
		testsMap.put("1221", "0");
		testsMap.put("123425", "4");
		testsMap.put("123123", "12");
		testsMap.put("12131415", "4");
		testsMap.put(Inputs.DAY_01_INPUT, "1076");

		for (String key : testsMap.keySet()) {
			Day01 day01 = new Day01(key);
			assertEquals(testsMap.get(key), day01.getPart2Answer());
		}
	}
}
