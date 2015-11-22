package com.tony.certification.wrapper;

public class WrapperTest {

	public static void main(final String[] args) {
		// Wrapper & primitive '=='
		final Integer i1 = 12;
		final int i2 = 12;
		System.out.println("i1 (Integer) == i2 (int) : " + (i1 == i2));

		// Wrapper & Wrapper, using new, '=='
		final Integer i3 = new Integer(12);
		final Integer i4 = new Integer(12);
		System.out.println("i3 (Integer) == i4 (Integer) : " + (i3 == i4));
	}
}
