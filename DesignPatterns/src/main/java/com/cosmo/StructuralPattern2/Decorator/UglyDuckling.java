package com.cosmo.StructuralPattern2.Decorator;

public class UglyDuckling implements Swan {

	@Override
	public void fly() {
		System.out.println("不能飛行");
	}

	@Override
	public void cry() {
		System.out.println("叫聲是：克魯﹍克魯﹍克魯﹍");
	}

	@Override
	public void desAppaearance() {
		System.out.println("外型是灰灰的");
	}

}
