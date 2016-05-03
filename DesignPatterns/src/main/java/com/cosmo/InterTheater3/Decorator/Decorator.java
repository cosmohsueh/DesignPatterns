package com.cosmo.InterTheater3.Decorator;

public abstract class Decorator implements IStar {

	private IStar star;

	public Decorator(IStar star) {
		this.star = star;
	}

	public void act() {
		this.star.act();
	}
}
