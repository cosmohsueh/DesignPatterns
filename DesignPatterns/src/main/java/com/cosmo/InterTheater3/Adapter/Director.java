package com.cosmo.InterTheater3.Adapter;

public class Director {

	public static void main(String[] args) {
		System.out.println("---演戲過程---");
		IStar star = new FilmStar();
		star.act("前十五分，明星本人演戲");
		IActor actor = new UnknowActor();
		IStar standin = new Standin(actor);
		standin.act("中間十五分，替身在演戲");
		star.act("後十五分，明星本人演戲");
	}
}
