package com.cosmo.FactoryMethodPattern;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黃色人種的皮膚是黃色的…");
	}

	@Override
	public void talk() {
		System.out.println("黃人會說話，一般說的是雙字節");
	}

}
