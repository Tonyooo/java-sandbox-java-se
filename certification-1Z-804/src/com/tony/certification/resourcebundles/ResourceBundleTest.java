package com.tony.certification.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(final String[] args) {
		System.out.println("Default PC locale = " + Locale.getDefault());

		final ResourceBundle resourceBundleDefault = ResourceBundle.getBundle("Texts");
		System.out.println("Default hello (en PC) = [" + resourceBundleDefault.getString("hello") + "]");

		final ResourceBundle resourceBundleFr = ResourceBundle.getBundle("Texts", new Locale("fr"));
		System.out.println("Fr hello = [" + resourceBundleFr.getString("hello") + "]");

		final ResourceBundle resourceBundleEn = ResourceBundle.getBundle("Texts", new Locale("de"));
		System.out.println("De hello = [" + resourceBundleEn.getString("hello") + "]");

		final ResourceBundle resourceBundleIt = ResourceBundle.getBundle("Texts", new Locale("it"));
		System.out.println("It hello (fallback on default) = [" + resourceBundleIt.getString("hello") + "]");
	}
}
