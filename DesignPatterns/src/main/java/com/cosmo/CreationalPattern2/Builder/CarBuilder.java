package com.cosmo.CreationalPattern2.Builder;

public abstract class CarBuilder {

	private ICar car;
	private Blueprint bp;

	public Car buildCar() {
		return new Car(this.buildWheel(), this.buildEngine());
	}

	public void receiveBlueprint(Blueprint bp) {
		this.bp = bp;
	}

	protected Blueprint getBlueprint() {
		return this.bp;
	}

	protected abstract String buildWheel();

	protected abstract String buildEngine();
}
