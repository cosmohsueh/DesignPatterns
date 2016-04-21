package com.cosmo.FactoryMethodPattern;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("---第一批是白人---");
		Human whiteHuman = new WhiteHumanFactory().createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("\n---第二批是黑人---");
		Human blackHuman = new BlackHumanFactory().createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("\n---第三批是黃人---");
		Human yellowHuman = new YellowHumanFactory().createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
