package com.cosmo.CreationalPattern.Builder;

public class ChildSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.superMan.setBody("嬌小的身體");
		super.superMan.setSpecialTalent("速度很快");
		super.superMan.setSpecialSymbol("小S");
		return super.superMan;
	}

}
