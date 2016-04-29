package com.cosmo.CreationalPattern.Builder;

public abstract class Builder {

	protected final SuperMan superMan = new SuperMan();

	public void setBody(String body) {
		this.superMan.setBody(body);
	}

	public void setSpecialTalent(String st) {
		this.superMan.setSpecialTalent(st);
	}

	public void setSepcialSymbol(String ss) {
		this.superMan.setSpecialSymbol(ss);
	}

	public abstract SuperMan getSuperMan();
}
