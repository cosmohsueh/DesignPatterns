package com.cosmo.StructuralPattern2.Adapter;

public class UglyDuckling extends WhiteSwan implements Duck {

	public void cry() {
		super.cry();
	}

	public void desAppearance() {
		super.desAppearance();
	}

	public void desBehavior() {
		System.out.println("會游泳");
		super.desBehavior();
	}
}
