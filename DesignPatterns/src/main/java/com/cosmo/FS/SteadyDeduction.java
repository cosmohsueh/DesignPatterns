package com.cosmo.FS;

public class SteadyDeduction implements IDeduction {

	@Override
	public boolean execute(Card card, Trade trade) {
		int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
		card.setFreeMoney(card.getFreeMoney() - halfMoney);
		card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
		return true;
	}

}
