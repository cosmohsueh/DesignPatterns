package com.cosmo.MediatorPattern;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	public void refuseBuyIBM() {
		System.out.println("不再採購電腦");
	}
}
