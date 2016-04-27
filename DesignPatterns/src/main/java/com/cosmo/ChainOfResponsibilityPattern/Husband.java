package com.cosmo.ChainOfResponsibilityPattern;

public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUERST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---妻子向丈夫請示---");
		System.out.println(women.getRequest());
		System.out.println("丈夫的回答是：同意");
	}

}
