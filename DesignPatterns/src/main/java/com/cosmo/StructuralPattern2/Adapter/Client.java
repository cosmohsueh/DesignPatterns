package com.cosmo.StructuralPattern2.Adapter;

public class Client {

	public static void main(String[] args) {
		System.out.println("五隻鴨子，四隻是這樣的");
		Duck duck = new Duckling();
		duck.cry();
		duck.desAppearance();
		duck.desBehavior();
		System.out.println("有一隻是醜小鴨");
		Duck uglyDuckling = new UglyDuckling();
		uglyDuckling.cry();
		uglyDuckling.desAppearance();
		uglyDuckling.desBehavior();
	}
}
