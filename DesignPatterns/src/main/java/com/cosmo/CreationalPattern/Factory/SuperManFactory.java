package com.cosmo.CreationalPattern.Factory;

public class SuperManFactory {

	public static ISuperMan createSuperMan(String type) {
		if (type.equals("adult")) {
			return new AdultSuperMan();
		} else if (type.equals("child")) {
			return new ChildSuperMan();
		} else {
			return null;
		}
	}
}
