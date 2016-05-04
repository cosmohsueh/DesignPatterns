package com.cosmo.OM;

public class Nobleman extends EventCustomer {

	public Nobleman() {
		super(EventCustomeType.EDIT);
		super.addCustomeType(EventCustomeType.CLONE);
	}

	@Override
	public void exec(ProductEvent event) {
		Product product = event.getSource();
		ProductEventType type = event.getType();
		if (type.getValue() == ProductEventType.CLONE_PRODUCT.getValue()) {
			System.out.println("貴族處理事件：" + product.getName() + "克隆, 事件類型：" + type);
		} else {
			System.out.println("貴族處理事件：" + product.getName() + "修改, 事件類型：" + type);
		}
	}

}
