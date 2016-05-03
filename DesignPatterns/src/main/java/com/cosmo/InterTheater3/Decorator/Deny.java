package com.cosmo.InterTheater3.Decorator;

public class Deny extends Decorator {

	public Deny(IStar star) {
		super(star);
	}

	@Override
	public void act() {
		super.act();
		System.out.println("演後：百般抵賴，死不承認");
	}

}
