package com.cosmo.OM;

import java.util.Vector;

public abstract class EventCustomer {

	private Vector<EventCustomeType> customType = new Vector<EventCustomeType>();

	public EventCustomer(EventCustomeType type) {
		this.addCustomeType(type);
	}

	public void addCustomeType(EventCustomeType type) {
		this.customType.addElement(type);
	}

	public Vector<EventCustomeType> getCustomType() {
		return this.customType;
	}

	public abstract void exec(ProductEvent event);
}
