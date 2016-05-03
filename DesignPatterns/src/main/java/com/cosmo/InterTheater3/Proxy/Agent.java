package com.cosmo.InterTheater3.Proxy;

public class Agent implements IStar {

	private IStar star;

	public Agent(IStar star) {
		this.star = star;
	}

	@Override
	public void sign() {
		this.star.sign();
	}

}
