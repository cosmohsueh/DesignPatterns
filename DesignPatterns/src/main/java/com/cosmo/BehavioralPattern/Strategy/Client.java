package com.cosmo.BehavioralPattern.Strategy;

public class Client {

	public static void main(String[] args) {
		Context context;

		context = new Context(new Zip());
		context = new Context(new Gzip());

		context.compress("d:\\temp", "d:\\temp.zip");
		context.uncompress("d:\\temp.zip", "d:\\temp");
	}
}
