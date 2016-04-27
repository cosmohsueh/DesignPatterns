package com.cosmo.MediatorPattern;

import java.util.Random;

public class Sale extends AbstractColleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("銷售IBM" + number + "台");
	}

	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("IBM銷售情況為：" + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}
