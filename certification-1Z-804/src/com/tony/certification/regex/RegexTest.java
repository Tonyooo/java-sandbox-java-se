package com.tony.certification.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(final String[] args) {
		applyRegex("1", "abaaaba", "ab");
		applyRegex("2", "ababa", "aba"); // lorsqu'un groupe de caractères a matché le pattern, l'ensemble des caractères de ce groupe sont 'consommés', et aucun ne peut faire partie d'un second macth (donc 1 seul match ici)
		applyRegex("3", "1a2z3r5h7k", "\\d"); // digits
		applyRegex("4", "1a2z3r5h7k", "\\D"); // non-digits
		applyRegex("5", "aba a bab", "\\s"); // spaces chars
		applyRegex("6", "aba a bab", "\\S"); // non-spaces chars
		applyRegex("7", "ab$+_ob a", "\\w"); // words [a-zA-Z0-9_] chars
		applyRegex("8", "ab$+_ob a", "\\W"); // non-words chars
		applyRegex("9", "ab$+_ob a", "\\b"); // débuts de changement de types entre \w & \W
		applyRegex("10", "ab$+_ob a", "\\B"); // non-débuts de changement de types entre \w & \W
		applyRegex("11", "ab$+_ob a", "[a-c]"); // range
		applyRegex("12", "ab$+_ob a", "[a-c]{2}"); // range with number of chars
		applyRegex("13", "ab$+_ob a", "([a-c])+"); // range (>= 1)
		applyRegex("14", "ab$+_ob a", "([^a])"); // pas de 'a'
		applyRegex("15", "ab$+_ob a", "(^a)"); // commence par 'a'
		applyRegex("16", "1zb45bd22", "\\d+"); // 1 ou + digits
		applyRegex("17", "a", "a?"); // 1 ou + digits
	}

	public static void applyRegex(final String id, final String text, final String regex) {
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(text);

		System.out.println("Example #" + id);
		System.out.println("Source text :  " + text);
		System.out.println("Char indexes : 0123456789");
		System.out.println("Regex : " + regex);

		System.out.print("Matching start positions : ");
		while(matcher.find()) {
			System.out.print(matcher.start() + "->" + matcher.end() + " (" + matcher.group() + "), ");
		}
		System.out.println("\n==============================================");
	}
}
