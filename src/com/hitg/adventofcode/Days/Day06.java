package com.hitg.adventofcode.Days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * http://adventofcode.com/2017/day/6
 * 
 * --- Day 6: Memory Reallocation ---
 * 
 * @author Helton Isac
 *
 */
public class Day06 extends AbstractDay {

	public Day06(Object input) {
		super(input);
	}

	@Override
	public String getChallengeName() {
		return "--- Day 6: Memory Reallocation ---";
	}

	private int countStepsToMemoryReallocation(int[] array) {

		Set<String> status = new HashSet<>();

		int steps = 0;
		while (status.add(Util.arrayIntToString(array))) {
			steps++;
			int maxValue = -1;
			int maxIndex = 0;

			// find max index
			for (int i = 0; i < array.length; i++) {
				if (array[i] > maxValue) {
					maxValue = array[i];
					maxIndex = i;
				}
			}

			// Redistribute values
			array[maxIndex] = 0;
			while (maxValue > 0) {
				maxValue--;
				maxIndex = (maxIndex + 1) > (array.length - 1) ? 0 : maxIndex + 1;
				array[maxIndex]++;
			}

		}
		return steps;
	}

	private int countCyclesToMemoryReallocation(int[] array) {

		Map<String, Integer> status = new HashMap<>();

		int steps = 0;
		String key = Util.arrayIntToString(array);
		while (!status.containsKey(key)) {
			status.put(key, steps);
			steps++;
			int maxValue = -1;
			int maxIndex = 0;

			// find max index
			for (int i = 0; i < array.length; i++) {
				if (array[i] > maxValue) {
					maxValue = array[i];
					maxIndex = i;
				}
			}

			// Redistribute values
			array[maxIndex] = 0;
			while (maxValue > 0) {
				maxValue--;
				maxIndex = (maxIndex + 1) > (array.length - 1) ? 0 : maxIndex + 1;
				array[maxIndex]++;
			}
			key = Util.arrayIntToString(array);
		}
		return status.isEmpty() ? 0 : steps - status.get(key);
	}

	@Override
	public String getPart1Answer() {
		int[] blocks = Arrays.copyOf((int[]) this.input, ((int[]) this.input).length);
		return String.valueOf(countStepsToMemoryReallocation(blocks));
	}

	@Override
	public String getPart2Answer() {
		int[] blocks = Arrays.copyOf((int[]) this.input, ((int[]) this.input).length);
		return String.valueOf(countCyclesToMemoryReallocation(blocks));
	}

	@Override
	public String inputToString() {
		return Util.arrayIntToString((int[]) this.input);
	}

}
