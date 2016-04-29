package com.cosmo.BehavioralPattern.Strategy;

public interface Algorithm {

	public boolean compress(String source, String to);

	public boolean uncompress(String source, String to);
}
