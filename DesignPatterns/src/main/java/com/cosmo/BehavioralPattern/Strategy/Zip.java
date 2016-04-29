package com.cosmo.BehavioralPattern.Strategy;

public class Zip implements Algorithm {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + "--->" + to + " Zip壓縮成功");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + "--->" + to + " Zip解壓縮成功");
		return true;
	}

}
