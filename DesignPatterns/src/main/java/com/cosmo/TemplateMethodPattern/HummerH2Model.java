package com.cosmo.TemplateMethodPattern;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("悍馬H2啟動…");
	}

	@Override
	public void stop() {
		System.out.println("悍馬H2停止…");
	}

	@Override
	public void alarm() {
		System.out.println("悍馬H2鳴笛…");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍馬H2的引擎聲音是…");
	}

	protected boolean isAlarm(){
		return false;
	}
}
