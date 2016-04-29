package com.cosmo.StructuralPattern2.Adapter;

public class Duckling implements Duck {

	@Override
	public void cry() {
		System.out.println("叫聲是：嗄﹍嗄﹍嗄﹍");
	}

	@Override
	public void desAppearance() {
		System.out.println("外型是：黃白相間");
	}

	@Override
	public void desBehavior() {
		System.out.println("會游泳");
	}

}
