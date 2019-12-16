package com.mindtree.producer.model;

public class User {

	private String name;
	private String mobileNo;
	private String hometown;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {

	}

	public User(String name, String mobileNo, String hometown, int age) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.hometown = hometown;
		this.age = age;
	}
}