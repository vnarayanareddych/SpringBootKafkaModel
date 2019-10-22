package com.springboot.model;

public class Student {

	private int id;

	private String name;

	private String fathName;

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

	public String getFathName() {
		return fathName;
	}

	public void setFathName(String fathName) {
		this.fathName = fathName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fathName=" + fathName + "]";
	}

}
