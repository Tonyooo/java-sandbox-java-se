package com.tony.certification.innerclasses;

public class InnerClassesTest {

	private static String outerClassStaticField;
	private String outerClassField;
	private String outerClassMethod() { return "hoy"; }
	protected String outerClassProtectedMethod() { return "hey"; }

	public static void main(final String[] args) {
		// Classic inner class creation
		final InnerClassesTest.ClassicInnerClass classicInnerClass = new InnerClassesTest().new ClassicInnerClass();

		// Method local anonymous inner class
		String dummyField;
		dummyField = "foo";
		final String dummyFinalField = "bar";
		final Comparable<String> methodLocalInnerClass = new Comparable<String>() {
			@Override
			public int compareTo(final String o) {
				// System.out.println(dummyField); // Cannot access to method local non final vars
				System.out.println(dummyFinalField); // Can access to method local final vars
				return 0;
			}
		};

		// Method local inner class
		class Foo {}


	}

	// Classic
	private class ClassicInnerClass {
		public void method() {
			// Outer class intance access
			System.out.println(InnerClassesTest.this); // Outer class instance

			// Outer class field access
			// this.field // wrong
			System.out.println(InnerClassesTest.this.outerClassField); // Outer class's field
			System.out.println(outerClassField); // Outer class's field

			// Outer class's method access
			System.out.println(outerClassMethod());
			System.out.println(InnerClassesTest.this.outerClassMethod());
		}
	}

	// Anonymous subclass
	InnerClassesTest anonymousSubType = new InnerClassesTest() {
		// Override parent's class method
		@Override
		protected String outerClassProtectedMethod() {
			return "overriden";
		}
	};

	// Static nested class
	private static class StaticNestedClass {
		public void method() {
			System.out.println(outerClassStaticField); // Outer static private field
		}
	}
}
