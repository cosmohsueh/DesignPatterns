package com.cosmo.DIP;

public class Driver implements IDriver {

	private ICar car;

	public Driver(ICar car) {
		this.car = car;
	}

	@Override
	public void drive() {
		this.car.run();
	}
}
