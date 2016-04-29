package com.cosmo.StructuralPattern2.Decorator;

public class Decorator implements Swan {

	private Swan swan;

	public Decorator(Swan swan) {
		this.swan = swan;
	}

	@Override
	public void fly() {
		swan.fly();
	}

	@Override
	public void cry() {
		swan.cry();
	}

	@Override
	public void desAppaearance() {
		swan.desAppaearance();
	}

}
