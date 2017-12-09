package com.hitg.adventofcode.Days;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hitg.adventofcode.Days.Day04;

class Day04Test {

	@Test
	void testValidPassPhrase() {
		assertTrue(Day04.validPassPhrase("aa bb cc dd ee"));
		assertFalse(Day04.validPassPhrase("aa bb cc dd aa"));
		assertTrue(Day04.validPassPhrase("aa bb cc dd aaa"));
	}

	@Test
	void testValidPassPhrases() {
		String[] input = { "aa bb cc dd ee", "aa bb cc dd aa", "aa bb cc dd aaa" };
		assertEquals(2, Day04.validPassPhrases(input));
	}

	@Test
	void testValidPassPhraseAnagram() {
		assertTrue(Day04.validPassPhraseAnagram("abcde fghij"));
		assertFalse(Day04.validPassPhraseAnagram("abcde xyz ecdab"));
		assertTrue(Day04.validPassPhraseAnagram("a ab abc abd abf abj"));
		assertTrue(Day04.validPassPhraseAnagram("iiii oiii ooii oooi oooo"));
		assertFalse(Day04.validPassPhraseAnagram("oiii ioii iioi iiio"));
	}

	@Test
	void testValidPassPhrasesAnagram() {
		String[] input = { "abcde fghij", "abcde xyz ecdab", "a ab abc abd abf abj", "iiii oiii ooii oooi oooo",
				"oiii ioii iioi iiio" };
		assertEquals(3, Day04.validPassPhrasesAnagram(input));
	}

}
