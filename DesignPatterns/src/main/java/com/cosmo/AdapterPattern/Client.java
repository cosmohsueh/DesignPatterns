package com.cosmo.AdapterPattern;

public class Client {

	public static void main(String[] args) {
		IUserInfo userInfo = new OuterUserInfo();
		for (int i = 0; i < 101; i++) {
			userInfo.getHomeAddress();
		}
	}
}
