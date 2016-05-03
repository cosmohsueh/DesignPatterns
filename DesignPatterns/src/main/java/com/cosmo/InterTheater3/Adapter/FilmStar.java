package com.cosmo.InterTheater3.Adapter;

public class FilmStar implements IStar {

	@Override
	public void act(String context) {
		System.out.println("明星演戲：" + context);
	}

}
