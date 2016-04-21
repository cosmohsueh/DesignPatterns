package com.cosmo.FactoryMethodPattern;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白色人種的皮膚是白色的…");
	}

	@Override
	public void talk() {
		System.out.println("白人會說話，一般說的是單字節");
	}

}
