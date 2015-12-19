package com.tony.sandbox.binarytree.bstchecker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Binary tree generator
 * @author tony
 *
 */
public final class BinaryTreeGenerator {
	private static final int MIN_TREE_VALUE = 0;
	private static final int MAX_TREE_VALUE = 20;
	private static final int ROOT_TREE_VALUE = 10;
	private static final int MAX_DEEP = 7;

	private final List<Integer> keys = new ArrayList<>();


	private BinaryTreeGenerator(){}

	/**
	 * Create default binary tree generator
	 * @return
	 */
	public static BinaryTreeGenerator create() {
		return new BinaryTreeGenerator();
	}

	public Node createTree() {
		final int rootNodeValue = ROOT_TREE_VALUE;
		final Node rootNode = new Node(rootNodeValue, this.createLeftNode(rootNodeValue, MAX_DEEP), this.createRightNode(rootNodeValue, MAX_DEEP));
		return rootNode;
	}

	private Node createLeftNode(final int parentNodeValue, final int currentLevel) {
		final int currentNodeValue = generateUniqueValueBellow(parentNodeValue);
		if(currentNodeValue == MIN_TREE_VALUE || currentLevel == 0) {
			return new Node(currentNodeValue, null, null);
		} else {
			return new Node(currentNodeValue, createLeftNode(currentNodeValue, currentLevel -1), createRightNode(currentNodeValue, currentLevel -1));
		}
	}

	private Node createRightNode(final int parentNodeValue, final int currentLevel) {
		final int currentNodeValue = generateUniqueValueAbove(parentNodeValue);
		if(currentNodeValue >= MAX_TREE_VALUE || currentLevel == 0) {
			return new Node(currentNodeValue, null, null);
		} else {
			return new Node(currentNodeValue, createLeftNode(currentNodeValue, currentLevel -1), createRightNode(currentNodeValue, currentLevel -1));
		}
	}

	private int generateUniqueValueBellow(final int value) {
		int generatedValue = ThreadLocalRandom.current().nextInt(MIN_TREE_VALUE, value);
		while(this.keys.contains(generatedValue)) {
			System.out.println("Duplicate 'bellow' key [" + generatedValue + "]; trying again ...");
			generatedValue = ThreadLocalRandom.current().nextInt(MIN_TREE_VALUE, value);
		}
		this.keys.add(generatedValue);
		return generatedValue;
	}

	private int generateUniqueValueAbove(final int value) {
		int generatedValue = ThreadLocalRandom.current().nextInt(value + 1, MAX_TREE_VALUE + 1);
		while(this.keys.contains(generatedValue)) {
			System.out.println("Duplicate 'above' key [" + generatedValue + "]; trying again ...");
			generatedValue = ThreadLocalRandom.current().nextInt(value + 1, MAX_TREE_VALUE + 1);
		}
		this.keys.add(generatedValue);
		return generatedValue;

	}
}
