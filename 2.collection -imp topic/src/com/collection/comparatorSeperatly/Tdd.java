package com.collection.comparatorSeperatly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tdd {

	public static void main(String[] args) {

		List<Empl> list = new ArrayList<>();
		list.add(new Empl("robin", 2000));
		list.add(new Empl("joby", 8000));
		list.add(new Empl("jibin", 3000));
		list.add(new Empl("lizy", 5000));
		list.add(new Empl("thomas", 4000));

		Collections.sort(list, new MySalaryComp());

		// using forEach way to take values from list.
		list.forEach(s -> System.out.println(s));

		System.out.println("-------------------------------------");

		// Enhanced way to take values from list.
		for (Empl empl : list) {
			System.out.println(empl);
		}

		System.out.println("-------------------------------------");

		// Iterator to take values from list.

		Iterator<Empl> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
