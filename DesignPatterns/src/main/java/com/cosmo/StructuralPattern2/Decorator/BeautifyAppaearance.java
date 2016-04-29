package com.cosmo.StructuralPattern2.Decorator;

public class BeautifyAppaearance extends Decorator {

	public BeautifyAppaearance(Swan swan) {
		super(swan);
	}

	@Override
	public void desAppaearance() {
		System.out.println("外表是白色的，很討人喜愛");
	}

}
