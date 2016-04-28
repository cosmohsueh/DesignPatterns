package com.cosmo.MementoPattern;

public class Boy {

	private String state = "";

	public void changeState() {
		this.state = "心情可能很不好！";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

}
