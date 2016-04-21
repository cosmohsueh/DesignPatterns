package com.cosmo.FactoryMethodPattern;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
