package com.cosmo.CreationalPattern2.Builder;

public class BenzBuilder extends CarBuilder {

	@Override
	protected String buildWheel() {
		return super.getBlueprint().getWheel();
	}

	@Override
	protected String buildEngine() {
		return super.getBlueprint().getEngine();
	}

}
