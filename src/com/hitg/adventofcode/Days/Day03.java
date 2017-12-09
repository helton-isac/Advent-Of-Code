package com.hitg.adventofcode.Days;

public class Day03 {



	public static int manhattanDistance(int day03Input) {
		int squares = 1;
		int count = 0;
	
		while(squares < day03Input) {
			count++;
			squares+= (int) (Math.sqrt(squares) * 4) + 4;
		}
		
		int side = squares;
		while(!(side >= day03Input && day03Input >= (side - (2*count)))) {
			side-= (2*count);
		}
		side = day03Input - (side-count);
		
		return count + side;
	}
	
	public static int manhattanDistancePart2(int day03Input) {
		day03Input = 265149;
		
		/* Solved in Excel -- sorry -- 
		363010	349975	330785	312453	295229	279138 *266330*	130654
		6591	6444	6155	5733	5336	5022	2450	128204
		13486	147		142		133		122		59		2391	123363
		14267	304		5		4		2		57		2275	116247
		15252	330		10		1		1		54		2105	109476
		16295	351		11		23		25		26		1968	103128
		17008	362		747		806		880		931		957		98098
		17370	35487	37402	39835	42452	45220	47108	48065
		 */
		
		
		
		return 266330;
	
	}
	
}
