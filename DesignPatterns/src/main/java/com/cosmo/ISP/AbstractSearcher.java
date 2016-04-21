package com.cosmo.ISP;

public abstract class AbstractSearcher {

	protected IPettyGirl pettyGirl;

	public AbstractSearcher(IPettyGirl pettyGirl) {
		this.pettyGirl = pettyGirl;
	}

	public abstract void show();
}
