package com.cosmo.AdapterPattern;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("姓名是…");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("住址是…");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("手機號碼是…");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("分機號碼是…");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("職稱是…");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("家裡電話是…");
		return null;
	}

}
