package com.tony.certification.formatter;

public class FormatterTest {

	public static void main(final String[] args) {
		System.out.format("Second arg = %2$d, first arg = %1$d \n", 12, 13);
		System.out.format("Left justified on 4 pos number = [%1$-4d] \n", 99);
		System.out.format("Justified on 4 pos = [%1$-4d] \n", 99);
		System.out.format("Justified on 8 pos & add sign = [%1$-+8d] \n", 99);
		System.out.format("Justified on 8 pos & fill with 0 = [%1$08d] \n", 99);
		System.out.format("Justified on 8 pos & fill with 0 & add coma = [%1$0,8d] \n", 99999);
		System.out.format("Justified on 8 pos & add parenthesis = [%1$(8d] \n", -99999);
		System.out.format("Justified on 8 pos & roud to 2 after coma = [%1$8.2f] \n", 99.999);
	}
}
