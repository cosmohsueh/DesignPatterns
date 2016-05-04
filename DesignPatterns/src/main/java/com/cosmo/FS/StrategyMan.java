package com.cosmo.FS;

public enum StrategyMan {

	SteadyDeduction("com.cosmo.FS.SteadyDeduction"), 
	FreeDeduction("com.cosmo.FS.FreeDeduction");

	private String value = "";

	private StrategyMan(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
