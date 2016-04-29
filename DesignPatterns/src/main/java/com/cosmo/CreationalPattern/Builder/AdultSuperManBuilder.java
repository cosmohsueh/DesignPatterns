package com.cosmo.CreationalPattern.Builder;

public class AdultSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.superMan.setBody("強壯的身體");
		super.superMan.setSpecialTalent("會飛行");
		super.superMan.setSpecialSymbol("胸前S標記");
		return super.superMan;
	}

}
