package com.cosmo.OM;

public class Beggar extends EventCustomer {

	public Beggar() {
		super(EventCustomeType.DEL);
	}

	@Override
	public void exec(ProductEvent event) {
		Product product = event.getSource();
		ProductEventType type = event.getType();
		System.out.println("乞丐處理事件：" + product.getName() + "銷毀, 事件類型：" + type);
	}

}
