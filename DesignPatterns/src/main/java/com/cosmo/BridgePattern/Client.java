package com.cosmo.BridgePattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("---房地產公司---");
		House house = new House();
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("---山寨公司---");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(house);
		shanZhaiCorp.mackMoney();
	}
}
