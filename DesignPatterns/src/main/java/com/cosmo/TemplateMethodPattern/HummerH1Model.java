package com.cosmo.TemplateMethodPattern;

public class HummerH1Model extends HummerModel {
	
	private boolean alarmFlag = true;

	@Override
	public void start() {
		System.out.println("悍馬H1啟動…");
	}

	@Override
	public void stop() {
		System.out.println("悍馬H1停止…");
	}

	@Override
	public void alarm() {
		System.out.println("悍馬H1鳴笛…");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍馬H1的引擎聲音是…");
	}
	
	protected boolean isAlarm(){
		return this.alarmFlag;
	}

	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}
	
}
