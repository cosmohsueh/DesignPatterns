package com.cosmo.BridgePattern;

public class ShanZhaiCorp extends Corp {

	public ShanZhaiCorp(Product product) {
		super(product);
	}

	public void mackMoney() {
		super.makeMoney();
		System.out.println("我賺錢了");
	}

}
