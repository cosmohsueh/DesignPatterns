package com.cosmo.MediatorPattern;

public class Stock extends AbstractColleague {

	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	private static int COMPUTER_NUMBER = 100;

	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("庫存數量為：" + COMPUTER_NUMBER);
	}

	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("庫存數量為：" + COMPUTER_NUMBER);
	}

	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	public void clearStock() {
		System.out.println("清理存貨數量為：" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
