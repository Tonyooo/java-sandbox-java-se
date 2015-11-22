package com.tony.certification.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(final String[] args) {
		final String data = "jdoijezoie 987987879 LKJJ 89 Jjhii 7";
		try(Scanner scanner1 = new Scanner(data)) {
			scanner1.useDelimiter(" ");
			while(scanner1.hasNext()) {
				if(scanner1.hasNextInt()) {
					System.out.println("int = " + scanner1.nextInt());
				} else {
					System.out.println("s = " + scanner1.next());
				}
			}
		}
	}
}
