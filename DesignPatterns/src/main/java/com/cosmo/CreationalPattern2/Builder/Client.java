package com.cosmo.CreationalPattern2.Builder;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();

		System.out.println("生產奔馳SUV");
		ICar benzSuv = director.createBenzSuv();
		System.out.println(benzSuv);

		System.out.println("生產寶馬VAN");
		ICar bmwVan = director.createBMWVan();
		System.out.println(bmwVan);

		System.out.println("生產混合");
		ICar complexCar = director.createComplexCar();
		System.out.println(complexCar);
	}
}
