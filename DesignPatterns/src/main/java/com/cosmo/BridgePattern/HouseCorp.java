package com.cosmo.BridgePattern;

public class HouseCorp extends Corp {

	public HouseCorp(House house) {
		super(house);
	}

	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地產公司賺錢");
	}

}
