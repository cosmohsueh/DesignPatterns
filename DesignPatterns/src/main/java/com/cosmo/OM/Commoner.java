package com.cosmo.OM;

public class Commoner extends EventCustomer {

	public Commoner() {
		super(EventCustomeType.NEW);
	}

	@Override
	public void exec(ProductEvent event) {
		Product product = event.getSource();
		ProductEventType type = event.getType();
		System.out.println("平民處理事件：" + product.getName() + "誕生記, 事件類型：" + type);
	}

}
