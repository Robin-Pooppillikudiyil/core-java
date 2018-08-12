package com.hashValuesCheck;

public class BasicEqualsExample {

	public static void main(String[] args) {
		
		String s1 = new String("John");
		String s2 = new String("John");
		String s3 = s1; // references of the same object

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));

	}
}
