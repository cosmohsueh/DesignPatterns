package com.cosmo.BehavioralPattern.Strategy;

public class Context {

	private Algorithm al;

	public Context(Algorithm al) {
		this.al = al;
	}

	public boolean compress(String source, String to) {
		return al.compress(source, to);
	}

	public boolean uncompress(String source, String to) {
		return al.uncompress(source, to);
	}
}
