package com.cosmo.BuilderPattern;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("寶馬啟動…");
	}

	@Override
	protected void stop() {
		System.out.println("寶馬停止…");
	}

	@Override
	protected void alarm() {
		System.out.println("寶馬喇叭…");
	}

	@Override
	protected void engineBoom() {
		System.out.println("寶馬引擎…");
	}

}
