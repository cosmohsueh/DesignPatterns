package com.cosmo.InterTheater3.Decorator;

public class HotAir extends Decorator {

	public HotAir(IStar star) {
		super(star);
	}

	@Override
	public void act() {
		System.out.println("演前：誇誇其談，沒有自己不能演的角色");
		super.act();
	}

}
