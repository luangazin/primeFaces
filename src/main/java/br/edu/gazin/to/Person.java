package br.edu.gazin.to;

import java.util.Date;

public class Person {
	private long id;
	private String name;
	private Date birthDay;
	private static long counter = 0l;

	public Person() {
		counter++;
		setId(counter);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
}
