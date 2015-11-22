package com.tony.certification.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(final String[] args) throws ParseException {
		System.out.println("Current locale = " + Locale.getDefault(Locale.Category.FORMAT));
		System.out.println("Default number format (format) - default : " + NumberFormat.getInstance().format(123.456));
		System.out.println("Default number format (format) - en : " + NumberFormat.getInstance(new Locale("en")).format(123.456));
		System.out.println("Currency number format (format) - default : " + NumberFormat.getCurrencyInstance().format(123.456));
		System.out.println("Currency number format (format) - us : " + NumberFormat.getCurrencyInstance(new Locale("en", "us")).format(123.456));
		System.out.println("Number number format (format) : " + NumberFormat.getNumberInstance().format(123.456));
		System.out.println("Number number format (format) - us : " + NumberFormat.getNumberInstance(new Locale("en", "us")).format(123.456));
		System.out.println("Integer number format (format) : " + NumberFormat.getIntegerInstance().format(123.456));
		System.out.println("Integer number format (format) - us : " + NumberFormat.getIntegerInstance(new Locale("en", "us")).format(123.456));
		System.out.println("Percentage number format (format) : " + NumberFormat.getPercentInstance().format(123.456));
		System.out.println("Percentage number format (format) - us : " + NumberFormat.getPercentInstance(new Locale("en", "us")).format(123.456));

		// Default locale
		final NumberFormat numberFormatWithMaxFractionDigitTo2 = NumberFormat.getInstance();
		numberFormatWithMaxFractionDigitTo2.setMaximumFractionDigits(2);
		System.out.println("Default number format (format) - default - set maximum fraction digit to 2 : " + numberFormatWithMaxFractionDigitTo2.format(123.456));
		System.out.println("Default number format (parse) - default - set maximum fraction digit to 2 : " + numberFormatWithMaxFractionDigitTo2.parse("123,456"));

		// US locale
		final NumberFormat numberFormatWithMaxFractionDigitTo2_UsLocale = NumberFormat.getInstance(new Locale("en", "us"));
		numberFormatWithMaxFractionDigitTo2.setMaximumFractionDigits(2);
		System.out.println("Default number format (format) - default - set maximum fraction digit to 2 : " + numberFormatWithMaxFractionDigitTo2_UsLocale.format(123.456));
		System.out.println("Default number format (parse) - default - set maximum fraction digit to 2 : " + numberFormatWithMaxFractionDigitTo2_UsLocale.parse("123.456"));

		final NumberFormat numberFormatWithParseIntegerOnly = NumberFormat.getInstance();
		numberFormatWithParseIntegerOnly.setParseIntegerOnly(true);
		System.out.println("Default number format (format) - default - set parse integer only : " + numberFormatWithParseIntegerOnly.parse("123.456"));
	}
}
