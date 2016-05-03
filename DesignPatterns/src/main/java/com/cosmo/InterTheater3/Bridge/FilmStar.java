package com.cosmo.InterTheater3.Bridge;

public class FilmStar extends AbsStar {

	public FilmStar() {
		super(new ActFilm());
	}

	public FilmStar(AbsAction action) {
		super(action);
	}
	
	@Override
	public void doJob() {
		System.out.println("影星的工作");
		super.doJob();
	}

}
