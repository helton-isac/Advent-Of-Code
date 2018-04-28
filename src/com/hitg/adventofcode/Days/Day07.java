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

	Program rootNode = null;

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

		this.rootNode = map.get(mainNodeName);
		while (this.rootNode.getParent() != null) {
			this.rootNode = this.rootNode.getParent();
		}

		return this.rootNode.getName();
	}

	public int getDifferenceToBalanceTree() {
		if (this.rootNode == null) {
			this.getRootNode((String[]) this.input);
		}

		return -1;
	}

	int exactlyWeight = -1;

	private int calcWeightNode(Program node) {
		if (this.exactlyWeight != -1) {
			return -1;
		}
		int nodeWeight = node.getWeight();
		if (node.getChildren().size() > 0) {
			int[] weights = new int[node.getChildren().size()];
			int i = 0;
			for (Program p : node.getChildren()) {
				weights[i] = calcWeightNode(p);
				nodeWeight += weights[i];
				i++;
			}
			Map<Integer, Integer> minMaxTable = new HashMap<>();
			for (int w : weights) {
				if (!minMaxTable.containsKey(w)) {
					minMaxTable.put(w, 1);
				} else {
					minMaxTable.put(w, minMaxTable.get(w) + 1);
				}
			}
			if (minMaxTable.size() > 1 && this.exactlyWeight == -1) {
				int maxOcurrence = 0;
				int minOcurrence = 0;
				for (int key : minMaxTable.keySet()) {
					if (minMaxTable.get(key) > 1) {
						maxOcurrence = key;
					}else {
						minOcurrence = key;
					}
				}
				for (Program p : node.getChildren()) {
					if(calcWeightNode(p) == minOcurrence) {
						this.exactlyWeight = p.getWeight() + maxOcurrence - minOcurrence;						
					}
				}
			}
		}
		return nodeWeight;
	}

	@Override
	public String getPart1Answer() {
		return this.getRootNode((String[]) this.input);
	}

	@Override
	public String getPart2Answer() {
		this.getRootNode((String[]) this.input);
		this.calcWeightNode(this.rootNode);
		return String.valueOf(this.exactlyWeight);
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

		public LinkedList<Program> getChildren() {
			return this.childs;
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
