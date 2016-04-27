package com.cosmo.StrategyPattern;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("放綠燈…");
	}

}
