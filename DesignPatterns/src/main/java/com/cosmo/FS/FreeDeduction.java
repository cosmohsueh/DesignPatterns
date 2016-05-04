package com.cosmo.FS;

public class FreeDeduction implements IDeduction {

	@Override
	public boolean execute(Card card, Trade trade) {
		card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
		return true;
	}

}
