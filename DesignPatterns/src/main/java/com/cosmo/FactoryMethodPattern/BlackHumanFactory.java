package com.cosmo.FactoryMethodPattern;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
