package com.hitg.adventofcode.Days;

public final class Util {

	private Util() {
		
	}
	
	public static String arrayIntToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int value : array) {
			sb.append(value);
			sb.append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}

}
