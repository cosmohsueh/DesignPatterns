package com.cosmo.CreationalPattern2.AbstractFactory;

public class BMWSuv extends AbsBMW {

	private final static String X_SEARIES = "X系列車型SUV";

	@Override
	public String getModel() {
		return X_SEARIES;
	}

}
