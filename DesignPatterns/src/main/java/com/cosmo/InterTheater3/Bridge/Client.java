package com.cosmo.InterTheater3.Bridge;

public class Client {

	public static void main(String[] args) {
		AbsStar zhangSan = new FilmStar();
		AbsStar liSi = new Singer();

		zhangSan.doJob();
		liSi.doJob();

		liSi = new Singer(new ActFilm());
		liSi.doJob();
	}
}
