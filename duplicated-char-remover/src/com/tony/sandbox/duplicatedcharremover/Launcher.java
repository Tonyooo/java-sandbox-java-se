package com.tony.sandbox.duplicatedcharremover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {

	public static void main(final String[] args) {
		final String originString = "ahbbjjhddgah";

		System.out.println("Origin string = " + originString);

		// Order by alphabetical order
		final char[] chars = originString.toCharArray();
		Arrays.sort(chars);

		// Remove duplicate
		final List<Character> charsWithoutDuplicate = new ArrayList<>();
		for(int i = 0; i < chars.length ; ++i) {
			// Last ?
			if(i == chars.length - 1) { continue; }

			final char currentChar = chars[i];
			final char nextChar = chars[i + 1];
			if(currentChar != nextChar) {
				charsWithoutDuplicate.add(currentChar);
			}
		}

		System.out.print("Cleaned up string = ");
		charsWithoutDuplicate.forEach(System.out::print);
	}

}
