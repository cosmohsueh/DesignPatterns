package com.cosmo.CreationalPattern2.AbstractFactory;

public abstract class AbsBMW implements ICar {

	private final static String BMW_BAND = "寶馬汽車";

	public String getBand() {
		return BMW_BAND;
	}

	public abstract String getModel();
}
