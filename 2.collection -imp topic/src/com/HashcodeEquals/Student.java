package com.HashcodeEquals;

public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	/**
	 * 
	 * computer generated hashCode() and equal() method
	 */

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}*/

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (!(obj instanceof Student)) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		return this.getId() == ((Student) obj).getId();
	}
}
