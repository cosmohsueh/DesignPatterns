package com.cosmo.CreationalPattern.Factory;

public class Client {

	public static void main(String[] args) {
		ISuperMan superMan = SuperManFactory.createSuperMan("adult");
		superMan.specialTalent();
	}
}
