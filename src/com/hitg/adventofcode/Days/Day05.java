/**
 * 
 */
package com.hitg.adventofcode.Days;

import java.util.Arrays;

/**
 * http://adventofcode.com/2017/day/5
 * 
 * --- Day 5: A Maze of Twisty Trampolines, All Alike ---
 * 
 * @author Helton Isac
 *
 */
public class Day05 extends AbstractDay {

	public Day05(Object input) {
		super(input);
	}

	@Override
	public String getChallengeName() {
		return "--- Day 5: A Maze of Twisty Trampolines, All Alike ---";
	}

	@Override
	public String getPart1Answer() {
		return String.valueOf(solveMaze_Part1((int[]) this.input));
	}

	@Override
	public String getPart2Answer() {
		return String.valueOf(solveMaze_Part2((int[]) this.input));
	}

	@Override
	public String inputToString() {
		return Util.arrayIntToString((int[]) this.input);
	}

	private int solveMaze_Part1(int[] input) {
		int[] maze = Arrays.copyOf(input, input.length);
		int i = 0;
		int steps = 0;
		while (i < maze.length) {
			steps++;
			i += maze[i]++;
		}
		return steps;
	}
	
	private int solveMaze_Part2(int[] input) {
		int[] maze = Arrays.copyOf(input, input.length);
		int i = 0;
		int steps = 0;
		while (i < maze.length) {
			steps++;
			int nexti = i + maze[i];
			if(maze[i] >= 3) {
				maze[i]--;
			}else {
				maze[i]++;
			}
			i = nexti;
			
		}
		return steps;
	}
}
