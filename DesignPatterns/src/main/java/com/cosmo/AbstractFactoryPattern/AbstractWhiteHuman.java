package com.cosmo.AbstractFactoryPattern;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白人皮膚是白色的…");
	}

	@Override
	public void talk() {
		System.out.println("白人會說話，說話是單音節的…");
	}

}
