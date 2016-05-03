package com.cosmo.InterTheater3.Decorator;

public class Client {

	public static void main(String[] args) {
		IStar freakStar = new FreakStar();
		freakStar = new HotAir(freakStar);
		freakStar = new Deny(freakStar);
		System.out.println("---假明星---");
		freakStar.act();
	}
}
