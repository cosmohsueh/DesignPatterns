package com.cosmo.BehavioralPattern2.Strategy;

public class Context {

	private WorkAlgorithm wa;

	public WorkAlgorithm getWa() {
		return wa;
	}

	public void setWa(WorkAlgorithm wa) {
		this.wa = wa;
	}

	public void work() {
		wa.work();
	}

}
