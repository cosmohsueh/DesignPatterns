package com.cosmo.ChainOfResponsibilityPattern;

public class son extends Handler {

	public son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---母親向兒子請示---");
		System.out.println(women.getRequest());
		System.out.println("兒子的回答是：同意");
	}

}
