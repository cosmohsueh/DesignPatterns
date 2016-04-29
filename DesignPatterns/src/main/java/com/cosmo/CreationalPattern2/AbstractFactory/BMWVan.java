package com.cosmo.CreationalPattern2.AbstractFactory;

public class BMWVan extends AbsBMW {

	private final static String SEVENT_SEARIES = "7系列車型商務車";

	@Override
	public String getModel() {
		return SEVENT_SEARIES;
	}

}
