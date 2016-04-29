package com.cosmo.CreationalPattern2.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("---要求生產一輛奔馳SUV---");
		System.out.println("A.找到奔馳車工廠");
		CarFactory benzFactory = new BenzFactory();
		System.out.println("B.生產奔馳SUV");
		ICar benzSuv = benzFactory.createSuv();
		System.out.println("C.生產資訊如下：");
		System.out.println(benzSuv.getBand());
		System.out.println(benzSuv.getModel());
	}
}
