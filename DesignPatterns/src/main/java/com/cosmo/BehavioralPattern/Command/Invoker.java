package com.cosmo.BehavioralPattern.Command;

public class Invoker {

	private AbstractCmd ac;

	public Invoker(AbstractCmd ac) {
		this.ac = ac;
	}

	public boolean execute(String source, String to) {
		return ac.execute(source, to);
	}
}
