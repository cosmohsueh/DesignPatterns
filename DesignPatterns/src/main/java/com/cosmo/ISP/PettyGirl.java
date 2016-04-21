package com.cosmo.ISP;

public class PettyGirl implements IPettyGirl, IGoodBodyGirl, IGreatTemperamentGirl {

	private String name;

	public PettyGirl(String name) {
		this.name = name;
	}

	@Override
	public void goodLooking() {
		System.out.println(this.name + "---臉蛋很漂亮…");
	}

	@Override
	public void niceFigure() {
		System.out.println(this.name + "---身材非常棒…");
	}

	@Override
	public void greatTemperament() {
		System.out.println(this.name + "---氣質非常好…");
	}

}
