package com.cosmo.InterTheater3.Adapter;

public class UnknowActor implements IActor {

	@Override
	public void playact(String content) {
		System.out.println("普通演員：" + content);
	}

}
