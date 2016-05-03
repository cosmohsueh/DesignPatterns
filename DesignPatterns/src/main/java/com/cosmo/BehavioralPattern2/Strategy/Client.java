package com.cosmo.BehavioralPattern2.Strategy;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		System.out.println("小孩子");
		context.setWa(new ChildWork());
		context.work();
		System.out.println("成年人");
		context.setWa(new AdultWork());
		context.work();
		System.out.println("老人");
		context.setWa(new OldWork());
		context.work();
	}
}
