package com.cosmo.OM;

import java.util.Observable;

public class ProductEvent extends Observable {

	private Product source;
	private ProductEventType type;

	public ProductEvent(Product p) {
		this(p, ProductEventType.NEW_PRODUCT);
	}

	public ProductEvent(Product p, ProductEventType type) {
		this.source = p;
		this.type = type;
		notifyEventDispatch();
	}

	public Product getSource() {
		return this.source;
	}

	public ProductEventType getType() {
		return this.type;
	}

	private void notifyEventDispatch() {
		super.addObserver(EventDispatch.getEventDispatch());
		super.setChanged();
		super.notifyObservers(source);
	}
}
