package com.cosmo.AbstractFactoryPattern;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黃種人皮膚是黃色的…");
	}

	@Override
	public void talk() {
		System.out.println("黃種人會說話，說話是雙音節的…");
	}

}
