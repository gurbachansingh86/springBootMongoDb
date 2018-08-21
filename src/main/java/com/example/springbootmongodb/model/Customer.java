/**
 * 
 */
package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private String id;
	private String name;
	private String email;
	private int age;

	public Customer() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, name='%s', email='%s', age=%d]", id, name, email, age);
	}
}