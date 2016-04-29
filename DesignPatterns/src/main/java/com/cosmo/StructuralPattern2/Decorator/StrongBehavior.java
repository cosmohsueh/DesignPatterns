package com.cosmo.StructuralPattern2.Decorator;

public class StrongBehavior extends Decorator {

	public StrongBehavior(Swan swan) {
		super(swan);
	}

	@Override
	public void fly() {
		System.out.println("會飛行了");
	}

}
