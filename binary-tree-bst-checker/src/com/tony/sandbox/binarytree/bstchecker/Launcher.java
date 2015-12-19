package com.tony.sandbox.binarytree.bstchecker;

public class Launcher {

	public static void main(final String[] args) {
		final Node tree = BinaryTreeGenerator.create().createTree();

		System.out.println(tree);
	}

}
