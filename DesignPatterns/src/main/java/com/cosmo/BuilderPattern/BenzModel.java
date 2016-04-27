package com.cosmo.BuilderPattern;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔馳啟動…");
	}

	@Override
	protected void stop() {
		System.out.println("奔馳停止…");
	}

	@Override
	protected void alarm() {
		System.out.println("奔馳喇叭…");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔馳引擎…");
	}

}
