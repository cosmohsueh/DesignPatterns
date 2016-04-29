package com.cosmo.BehavioralPattern.Command;

public class ZipUncompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.zip.uncompress(source, to);
	}

}
