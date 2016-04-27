package com.cosmo.MediatorPattern;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){
			this.buyComputer((int) objects[0]);
		} else if(str.equals("sale.sell")){
			this.sellComputer((int)objects[0]);
		} else if(str.equals("sale.offsell")){
			this.offSell();
		} else if(str.equals("stock.clear")){
			this.clearStock();
		}
	}

	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {
			System.out.println("採購IBM電腦" + number + "台");
			stock.increase(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("採購IBM電腦" + buyNumber + "台");
		}
	}

	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) {
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}

	private void offSell() {
		System.out.println("折價銷售IBM電腦" + super.stock.getStockNumber() + "台");
	}
	
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
