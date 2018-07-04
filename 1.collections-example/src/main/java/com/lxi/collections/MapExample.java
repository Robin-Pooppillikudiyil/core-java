package com.lxi.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapExample {

	private Map<String, User> users = new HashMap<>();

	public static void main(String[] args) {
		MapExample example = new MapExample();
		example.createMap();
		example.printMapOldWay();
		example.printMapNewWay();
	}

	private void createMap() {
		users.put("1", new User("Joby", "Pooppillikudiyil", 37));
		users.put("2", new User("Jibin", "Pooppillikudiyil", 31));
		users.put("3", new User("Robin", "Pooppillikudiyil", 24));
		users.put("4", new User("Thomas", "Pooppillikudiyil", 65));
		users.put("5", new User("Lizy", "Pooppillikudiyil", 54));
	}

	private void printMapNewWay() {
		users.keySet().forEach(key -> printUser(users.get(key)));
	}

	private void printMapOldWay() {

		for (String key : users.keySet()) {
			printUser(users.get(key));
		}
	}

	private void printUser(User user) {
		log.info("User is {}", user);
	}
}
