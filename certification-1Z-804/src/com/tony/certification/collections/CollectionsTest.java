package com.tony.certification.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTest {

	public static void main(final String[] args) {

		// Hashtable : ISO to hashmap (not ordered, not sorted), instead it's synchroized and doesn't support null values
		final Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("venus", "value1");
		hashtable.put("albert", "value2");
		hashtable.put("remi", "value3");
		System.out.println("Hashtable = " + hashtable);

		// LinkedHashMap : keep insertion order
		final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("venus", "value1");
		linkedHashMap.put("albert", "value2");
		linkedHashMap.put("remi", "value3");
		System.out.println("LinkedHashMap = " + linkedHashMap);

		// TreeMap : Sorted by natural order
		final TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("venus", "value1");
		treeMap.put("albert", "value2");
		treeMap.put("remi", "value3");
		System.out.println("TreeMap = " + treeMap);

		// HashSet : no ordered, not sorted (value are internally sorted by hash)
		final HashSet<String> hashSet = new HashSet<>();
		hashSet.add("venus");
		hashSet.add("albert");
		hashSet.add("remi");
		System.out.println("HashSet = " + hashSet);

		// TreeSet : sorted by natural order or compareTo
		final TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("venus");
		treeSet.add("albert");
		treeSet.add("remi");
		System.out.println("TreeSet = " + treeSet);

		// Sort List
		final List<String> listToBeSorted = new ArrayList<>();
		listToBeSorted.add("zebulon");
		listToBeSorted.add("bernard");
		listToBeSorted.add("robert");
		listToBeSorted.add("Alphonse");
		System.out.println("Unsorted list = " + listToBeSorted);
		Collections.sort(listToBeSorted);
		System.out.println("Sorted list (by String.compareTo) = " + listToBeSorted);
		System.out.println("BinarySearch without specific comparator = " + Collections.binarySearch(listToBeSorted, "bernard"));
		final Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(final String o1, final String o2) {
				return o2.length() - o1.length();
			}
		};
		Collections.sort(listToBeSorted, comparator);
		System.out.println("Sorted list (by specified comparator) = " + listToBeSorted);
		System.out.println("BinarySearch without specific comparator = " + Collections.binarySearch(listToBeSorted, "robert", comparator));

		// PriorityQueue : sorted by compareTo
		final PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("8");
		priorityQueue.add("4");
		priorityQueue.offer("5");
		priorityQueue.offer("1");
		System.out.println("PriorityQueue initialized = " + priorityQueue);
		System.out.println("PriorityQueue peek() = " + priorityQueue.peek());
		System.out.println("PriorityQueue current = " + priorityQueue);
		System.out.println("PriorityQueue poll() = " + priorityQueue.poll());
		System.out.println("PriorityQueue current = " + priorityQueue);
		System.out.println("PriorityQueue poll() = " + priorityQueue.poll());
		System.out.println("PriorityQueue current = " + priorityQueue);
		System.out.println("PriorityQueue poll() = " + priorityQueue.poll());
		System.out.println("PriorityQueue current = " + priorityQueue);
		System.out.println("PriorityQueue remove(\"10\") = " + priorityQueue.remove("10"));
		System.out.println("PriorityQueue current = " + priorityQueue);
		System.out.println("PriorityQueue remove(\"4\") = " + priorityQueue.remove("4"));
		System.out.println("PriorityQueue current = " + priorityQueue);
	}
}
