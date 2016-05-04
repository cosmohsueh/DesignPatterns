package com.cosmo.OM;

public class ProductManager {

	private boolean isPermittedCreate = false;

	public Product createProduct(String name) {
		isPermittedCreate = true;
		Product product = new Product(this, name);
		new ProductEvent(product, ProductEventType.NEW_PRODUCT);
		return product;
	}

	public void abandonProduct(Product p) {
		new ProductEvent(p, ProductEventType.DEL_PRODUCT);
		p = null;
	}

	public void editProduct(Product p, String name) {
		new ProductEvent(p, ProductEventType.EDIT_PRODUCT);
		p.setName(name);
	}

	public boolean isCreateProduct() {
		return isPermittedCreate;
	}

	public Product clone(Product p) {
		new ProductEvent(p, ProductEventType.CLONE_PRODUCT);
		return p.clone();
	}
}
