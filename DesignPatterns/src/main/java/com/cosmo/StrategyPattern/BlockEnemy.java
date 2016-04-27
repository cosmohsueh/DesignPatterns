package com.cosmo.StrategyPattern;

public class BlockEnemy implements IStrategy {

	@Override
	public void operate() {
		System.out.println("斷後…");
	}

}
