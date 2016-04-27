package com.cosmo.AbstractFactoryPattern;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑人皮膚是黑色的…");
	}

	@Override
	public void talk() {
		System.out.println("黑人會說話，但聽不懂…");
	}

}
