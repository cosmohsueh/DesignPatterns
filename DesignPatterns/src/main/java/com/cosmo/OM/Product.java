package com.cosmo.OM;

public class Product implements Cloneable {

	private String name;
	private boolean canChanged = false;

	public Product(ProductManager manager, String name) {
		if (manager.isCreateProduct()) {
			canChanged = true;
			this.name = name;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (canChanged) {
			this.name = name;
		}
	}

	@Override
	protected Product clone() {
		Product p = null;
		try {
			p = (Product) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
