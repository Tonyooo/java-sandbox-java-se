package com.tony.certification.calendar;

import java.util.Calendar;
import java.util.Locale;

public class CalendarTest {

	public static void main(String[] args) {
		System.out.println("Default calendar - default locale - first day of week : " + Calendar.getInstance().getFirstDayOfWeek());
		System.out.println("Default calendar - us locale - first day of week : " + Calendar.getInstance(new Locale("en", "us")).getFirstDayOfWeek());
	}
}
