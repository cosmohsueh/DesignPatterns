package com.cosmo.ChainOfResponsibilityPattern;

public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---女兒向父親請示---");
		System.out.println(women.getRequest());
		System.out.println("父親的回答是：同意");
	}

}
