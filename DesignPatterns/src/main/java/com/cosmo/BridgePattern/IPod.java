package com.cosmo.BridgePattern;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("生產ipod…");
	}

	@Override
	public void beSelled() {
		System.out.println("賣掉ipod…");
	}

}
