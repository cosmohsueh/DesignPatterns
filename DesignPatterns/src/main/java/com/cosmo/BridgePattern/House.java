package com.cosmo.BridgePattern;

public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("生產房子…");
	}

	@Override
	public void beSelled() {
		System.out.println("賣掉房子…");
	}

}
