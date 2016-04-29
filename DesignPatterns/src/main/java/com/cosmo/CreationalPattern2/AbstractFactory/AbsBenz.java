package com.cosmo.CreationalPattern2.AbstractFactory;

public abstract class AbsBenz implements ICar {

	private final static String BENZ_BAND = "奔馳汽車";

	public String getBand() {
		return BENZ_BAND;
	}

	public abstract String getModel();

}
