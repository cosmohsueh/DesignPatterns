package com.cosmo.OM;

public class Client {

	public static void main(String[] args) {
		EventDispatch dispatch = EventDispatch.getEventDispatch();
		dispatch.registerCustomer(new Beggar());
		dispatch.registerCustomer(new Commoner());
		dispatch.registerCustomer(new Nobleman());

		ProductManager factory = new ProductManager();

		System.out.println("---模擬創建產品事件---");
		System.out.println("---小男孩原子彈---");
		Product p = factory.createProduct("小男孩原子彈");

		System.out.println("---修改產品事件---");
		System.out.println("---胖子號原子彈---");
		factory.editProduct(p, "胖子號原子彈");

		System.out.println("---克隆原子彈---");
		factory.clone(p);

		System.out.println("---銷毀原子彈---");
		factory.abandonProduct(p);
	}
}
