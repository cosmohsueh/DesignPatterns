package com.cosmo.StrategyPattern;

public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("開門…");
	}

}
