package com.cosmo.BehavioralPattern.Command;

public class GzipReceiver implements IReceiver {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + "--->" + to + " GZIP壓縮成功");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + "--->" + to + " GZIP解壓縮成功");
		return true;
	}

}
