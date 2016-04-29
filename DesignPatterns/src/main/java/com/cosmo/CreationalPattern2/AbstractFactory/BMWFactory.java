package com.cosmo.CreationalPattern2.AbstractFactory;

public class BMWFactory implements CarFactory {

	@Override
	public ICar createSuv() {
		return new BMWSuv();
	}

	@Override
	public ICar createVan() {
		return new BMWVan();
	}

}
