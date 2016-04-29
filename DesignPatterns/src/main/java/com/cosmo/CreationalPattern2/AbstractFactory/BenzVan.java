package com.cosmo.CreationalPattern2.AbstractFactory;

public class BenzVan extends AbsBenz {

	private final static String R_SERIES = "R系列商務車";

	@Override
	public String getModel() {
		return R_SERIES;
	}

}
