package com.cosmo.DIP;

public class Client {

	public static void main(String[] args) {
		Driver zhangSan = new Driver(new Benz());
		zhangSan.drive();
	}

}
