package com.tony.certification.dateformat;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		final Date date = new Date();
		
		System.out.println("DateFormat.getInstance()\t\t\t=> " + DateFormat.getInstance().format(date));
		System.out.println("DateFormat.getDateInstance()\t\t\t=> " + DateFormat.getDateInstance().format(date));
		System.out.println("DateFormat.getDateInstance(DateFormat.SHORT)\t=> " + DateFormat.getDateInstance(DateFormat.SHORT).format(date));
		System.out.println("DateFormat.getDateInstance(DateFormat.MEDIUM)\t=> " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));
		System.out.println("DateFormat.getDateInstance(DateFormat.LONG)\t=> " + DateFormat.getDateInstance(DateFormat.LONG).format(date));
		System.out.println("DateFormat.getDateInstance(DateFormat.FULL)\t=> " + DateFormat.getDateInstance(DateFormat.FULL).format(date));
	}
}
