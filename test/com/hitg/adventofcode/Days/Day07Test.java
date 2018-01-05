package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day07Test {

	String[] input = {
			"pbga 66"
			,"xhth 57"
			,"ebii 61"
			,"havc 66"
			,"ktlj 57"
			,"fwft 72 ktlj cntj xhth"
			,"qoyq 66"
			,"padx 45 pbga havc qoyq"
			,"tknk 41 ugml padx fwft"
			,"jptl 61"
			,"ugml 68 gyxo ebii jptl"
			,"gyxo 61"
			,"cntj 57"
	};
	
	@Test
	void test() {
		Day07 day07 = new Day07(this.input);
		assertEquals("tknk", day07.getPart1Answer());
		//assertEquals("---", day07.getPart2Answer());
		
		day07 = new Day07(Inputs.DAY_07_INPUT);
		assertEquals("hmvwl", day07.getPart1Answer());
		//assertEquals("---", day07.getPart2Answer());
	}

}
