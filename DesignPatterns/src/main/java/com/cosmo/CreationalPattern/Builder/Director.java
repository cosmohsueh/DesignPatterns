package com.cosmo.CreationalPattern.Builder;

public class Director {

	private static Builder adultBuilder = new AdultSuperManBuilder();
	private static Builder childBuilder = new ChildSuperManBuilder();

	public static SuperMan getAdultSuperMan() {
		return adultBuilder.getSuperMan();
	}

	public static SuperMan getChildSuperMan() {
		return childBuilder.getSuperMan();
	}
}
