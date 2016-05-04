package com.cosmo.FS;

public class DeductionContext {

	private IDeduction deduction = null;

	public DeductionContext(IDeduction deduction) {
		this.deduction = deduction;
	}

	public boolean execute(Card card, Trade trade) {
		return this.deduction.execute(card, trade);
	}
}
