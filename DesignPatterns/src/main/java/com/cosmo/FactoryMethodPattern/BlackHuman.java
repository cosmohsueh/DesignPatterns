package com.cosmo.FactoryMethodPattern;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人種的皮膚是黑色的…");
	}

	@Override
	public void talk() {
		System.out.println("黑人會說話，一般人聽不懂");
	}

}
