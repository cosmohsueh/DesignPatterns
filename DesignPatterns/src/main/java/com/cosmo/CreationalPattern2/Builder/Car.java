package com.cosmo.CreationalPattern2.Builder;

public class Car implements ICar {

	private String wheel;
	private String engine;

	public Car(String wheel, String engine) {
		this.wheel = wheel;
		this.engine = engine;
	}

	@Override
	public String getWheel() {
		return this.wheel;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String toString() {
		return "車的輪子是：" + this.wheel + ", 車的引擎是：" + this.engine;
	}

}
