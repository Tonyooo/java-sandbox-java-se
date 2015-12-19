package com.tony.sandbox.binarytree.bstchecker;

/**
 * Node
 * @author tony
 *
 */
public final class Node {
	private final int value;
	private final Node left;
	private final Node right;

	public Node(final int value, final Node left, final Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() { return value; }
	public Node getLeft() { return left; }
	public Node getRight() { return right; }

	@Override
	public String toString() {
		return "Node [value=" + value + "] \n\t-> left=" + left.value + "\n\t -> right=" + right.value;
	}
}
