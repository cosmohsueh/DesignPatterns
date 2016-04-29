package com.cosmo.StructuralPattern2.Decorator;

public class Client {

	public static void main(String[] args) {
		System.out.println("有隻醜小鴨");
		Swan duckling = new UglyDuckling();
		duckling.desAppaearance();
		duckling.cry();
		duckling.fly();
		System.out.println("長大變天鵝");
		duckling = new BeautifyAppaearance(duckling);
		duckling = new StrongBehavior(duckling);
		duckling.desAppaearance();
		duckling.cry();
		duckling.fly();
	}
}
