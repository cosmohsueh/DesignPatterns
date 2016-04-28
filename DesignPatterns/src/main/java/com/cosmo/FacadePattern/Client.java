package com.cosmo.FacadePattern;

public class Client {

	public static void main(String[] args) {
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		String context = "djfaklfjlk";
		String address = "aaaaaaa";
		hellRoadPostOffice.sendLetter(context, address);
	}
}
