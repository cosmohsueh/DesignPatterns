package com.cosmo.BehavioralPattern.Command;

public class ZipReceiver implements IReceiver {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + "--->" + to + " ZIP壓縮成功");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + "--->" + to + " ZIP解壓縮成功");
		return true;
	}

}
