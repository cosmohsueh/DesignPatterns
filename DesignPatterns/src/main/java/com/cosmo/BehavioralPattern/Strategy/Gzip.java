package com.cosmo.BehavioralPattern.Strategy;

public class Gzip implements Algorithm {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + "--->" + to + " Gzip壓縮成功");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + "--->" + to + " Gzip解壓縮成功");
		return true;
	}

}
