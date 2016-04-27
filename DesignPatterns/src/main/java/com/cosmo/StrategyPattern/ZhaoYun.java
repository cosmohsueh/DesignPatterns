package com.cosmo.StrategyPattern;

public class ZhaoYun {

	public static void main(String[] args) {
		Context context;
		System.out.println("---拆第一個---");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println("---拆第二個---");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("---拆第三個---");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
