package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		System.out.println("\n-----------------Elements in the set------------------------------");

		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);

		System.out.println("\n----------------- HashSet --> unique and sorted-------------------");

		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println(uniqueNumbers);

		System.out.println("\n----------LinkedHashSet --> unique elements & not sorted----------");

		Set<Integer> uniqueNumbers1 = new LinkedHashSet<>(listNumbers);
		System.out.println(uniqueNumbers1);

		System.out.println("\n----------------TreeSet --> unique elements & sorted--------------");

		Set<Integer> uniqueNumbers2 = new TreeSet<>(listNumbers);
		System.out.println(uniqueNumbers2);

	}

}
