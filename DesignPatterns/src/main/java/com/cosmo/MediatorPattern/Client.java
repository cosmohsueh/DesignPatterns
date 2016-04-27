package com.cosmo.MediatorPattern;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		System.out.println("---採購人員採購電腦---");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		
		System.out.println("---銷售人員銷售電腦---");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		
		System.out.println("---清理庫存---");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
