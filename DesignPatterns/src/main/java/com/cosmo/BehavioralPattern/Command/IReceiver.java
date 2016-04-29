package com.cosmo.BehavioralPattern.Command;

public interface IReceiver {

	public boolean compress(String source, String to);

	public boolean uncompress(String source, String to);
}
