package com.cosmo.CreationalPattern.Builder;

public class Client {

	public static void main(String[] args) {
		SuperMan adultSuperMan = Director.getAdultSuperMan();
		System.out.println(adultSuperMan.getBody());
		adultSuperMan.getSpecialTalent();
		adultSuperMan.getSpecialSymbol();
	}
}
