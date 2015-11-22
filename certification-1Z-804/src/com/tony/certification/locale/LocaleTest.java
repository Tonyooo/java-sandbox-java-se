package com.tony.certification.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {

		// Localized date formats
		final Date date = new Date();
		final Locale frItLocale = new Locale("fr", "it");
		System.out.println("fr_it : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, frItLocale).format(date));
		final Locale itItLocale = new Locale("it", "it");
		System.out.println("it_it : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, itItLocale).format(date));
		final Locale frChLocale = new Locale("fr", "ch");
		System.out.println("fr_ch : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, frChLocale).format(date));
		final Locale frBeLocale = new Locale("fr", "be");
		System.out.println("fr_be : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, frBeLocale).format(date));
		final Locale frFrLocale = new Locale("fr", "fr");
		System.out.println("fr_fr : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, frFrLocale).format(date));
		final Locale jaJaLocale = new Locale("ja", "ja");
		System.out.println("ja_ja : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, jaJaLocale).format(date));
		final Locale enGbLocale = new Locale("en", "gb");
		System.out.println("en_gb : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, enGbLocale).format(date));
		final Locale enUsLocale = new Locale("en", "us");
		System.out.println("en_us : " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, enUsLocale).format(date));
		
		System.out.println("==============================");
		
		// Localized country name
		System.out.println("fr country in english : " + frFrLocale.getDisplayCountry(enGbLocale));
		System.out.println("fr country in italian : " + frFrLocale.getDisplayCountry(itItLocale));
	}
}
