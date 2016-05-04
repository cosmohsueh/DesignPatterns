package com.cosmo.OM;

public enum EventCustomeType {

	NEW(1), 
	DEL(2), 
	EDIT(3), 
	CLONE(4);

	private int value;

	private EventCustomeType(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
