package com.kinisoftware.bdd.jbehave;

public class Task {

	private String description;

	public Task(String description) {
		this.description = description;
	}

	public String description() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		Task other = (Task) obj;
		if (!description.equals(other.description))
			return false;
		return true;
	}

}
