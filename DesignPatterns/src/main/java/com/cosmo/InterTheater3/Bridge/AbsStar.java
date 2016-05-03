package com.cosmo.InterTheater3.Bridge;

public abstract class AbsStar {

	protected final AbsAction action;

	public AbsStar(AbsAction action) {
		this.action = action;
	}

	public void doJob() {
		this.action.desc();
	}
}
