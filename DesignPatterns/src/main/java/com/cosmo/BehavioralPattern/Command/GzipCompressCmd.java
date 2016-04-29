package com.cosmo.BehavioralPattern.Command;

public class GzipCompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.gzip.compress(source, to);
	}

}
