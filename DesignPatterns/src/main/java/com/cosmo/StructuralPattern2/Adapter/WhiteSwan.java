package com.cosmo.StructuralPattern2.Adapter;

public class WhiteSwan implements Duck {

	@Override
	public void cry() {
		System.out.println("叫聲是：克魯﹍克魯﹍克魯﹍");
	}

	@Override
	public void desAppearance() {
		System.out.println("外型是：灰灰的");
	}

	@Override
	public void desBehavior() {
		System.out.println("能夠飛行");
	}

}
