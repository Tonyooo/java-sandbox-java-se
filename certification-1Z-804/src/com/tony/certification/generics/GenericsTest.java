package com.tony.certification.generics;

import java.util.List;

public class GenericsTest {

	public static void main(final String[] args) {
		//		applyWithExtends(new ArrayList<String>());
		//		applyWithSuper(new ArrayList<String>());
	}

	public static void applyWithExtendsWildcards(final List<? extends Comparable<? extends String>> list) {
		//		list.add("hoy");
	}

	public static <U extends CharSequence, T extends Comparable<U>> void applyWithExtendsParameterizedTypes(final List<T> list) {
		//		list.add(new Comparable<U>() {
		//
		//			@Override
		//			public int compareTo(final U o) {
		//				// TODO Auto-generated method stub
		//				return 0;
		//			}
		//		});
	}

	public static void applyWithSuper(final List<? super Comparable<? extends String>> list) {
		list.add("hoy");
	}
}
