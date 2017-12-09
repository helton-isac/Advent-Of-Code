package com.hitg.adventofcode.Days;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * http://adventofcode.com/2017/day/4
 * 
 * --- Day 4: High-Entropy Passphrases ---
 * 
 * @author Helton Isac
 *
 */
public class Day04 extends AbstractDay {

	public Day04(Object input) {
		super(input);
	}

	public static boolean validPassPhrase(String input) {

		String[] words = input.split(" ");
		Set<String> wordsSet = new HashSet<String>();

		for (String word : words) {
			if (!wordsSet.add(word)) {
				return false;
			}
		}

		return true;
	}

	public static int validPassPhrases(String[] input) {
		int count = 0;
		for (String passPhrase : input) {
			if (validPassPhrase(passPhrase)) {
				count++;
			}
		}
		return count;
	}

	public static boolean validPassPhraseAnagram(String input) {

		String[] words = input.split(" ");
		Set<String> wordsSet = new HashSet<String>();

		for (String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			if (!wordsSet.add(new String(charArray))) {
				return false;
			}
		}

		return true;
	}

	public static int validPassPhrasesAnagram(String[] input) {
		int count = 0;
		for (String passPhrase : input) {
			if (validPassPhraseAnagram(passPhrase)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String getChallengeName() {
		return "--- Day 4: High-Entropy Passphrases ---";
	}

	@Override
	public String getPart1Answer() {
		return String.valueOf(validPassPhrases((String[]) this.input));
	}

	@Override
	public String getPart2Answer() {
		return String.valueOf(validPassPhrasesAnagram((String[]) this.input));
	}

	@Override
	public String inputToString() {
		String[] stringArray = (String[]) this.input;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < stringArray.length; i++) {
			sb.append(stringArray[i]);
			sb.append("\n");
			if(i > 10) {
				sb.append("...");
				break;
			}
		}

		return sb.toString();
	}

}
