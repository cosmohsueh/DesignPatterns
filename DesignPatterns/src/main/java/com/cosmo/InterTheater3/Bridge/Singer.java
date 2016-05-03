package com.cosmo.InterTheater3.Bridge;

public class Singer extends AbsStar {
	
	public Singer(){
		super(new Sing());
	}

	public Singer(AbsAction action) {
		super(action);
	}

	@Override
	public void doJob() {
		System.out.println("歌手的工作");
		super.doJob();
	}
}
