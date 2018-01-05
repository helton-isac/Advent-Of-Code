package com.hitg.adventofcode.Days;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * http://adventofcode.com/2017/day/7
 * 
 * --- Day 7: Recursive Circus ---
 * 
 * @author Helton Isac
 *
 */
public class Day07 extends AbstractDay {

	public Day07(Object input) {
		super(input);
	}

	@Override
	public String getChallengeName() {
		return "--- Day 7: Recursive Circus ---";
	}

	public String getRootNode(String[] input) {

		Map<String, Program> map = new HashMap<>();

		String mainNodeName = "";
		for (String str : input) {
			String[] nodes = str.split(" ");
			mainNodeName = nodes[0];
			int mainNodeWeight = Integer.parseInt(nodes[1]);

			Program program = map.get(mainNodeName);
			if (program == null) {
				program = new Program(mainNodeName, mainNodeWeight);
				map.put(mainNodeName, program);
			} else {
				program.setWeight(mainNodeWeight);
			}

			for (int i = 2; i < nodes.length; i++) {
				Program child = map.get(nodes[i]);
				if (child == null) {
					child = new Program(nodes[i], null);
					map.put(nodes[i], child);
				}
				program.addChild(child);
			}
		}

		Program p = map.get(mainNodeName);
		while (p != null) {
			mainNodeName = p.getName();
			p = p.getParent();
		}

		return mainNodeName;
	}

	@Override
	public String getPart1Answer() {
		return this.getRootNode((String[]) this.input);
	}

	@Override
	public String getPart2Answer() {
		return String.valueOf(2);
	}

	@Override
	public String inputToString() {
		return "";
	}

	class Program {

		private Integer weight;
		private String name;
		private Program parent = null;
		private LinkedList<Program> childs = new LinkedList<>();

		Program(String name, Integer weight) {
			this.name = name;
			this.weight = weight;
		}

		public void setParent(Program parent) {
			this.parent = parent;
		}

		public Program getParent() {
			return this.parent;
		}

		public String getName() {
			return this.name;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getWeight() {
			return this.weight;
		}

		public void addChild(Program child) {
			child.setParent(this);
			this.childs.push(child);
		}

	}

}
