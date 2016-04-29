package com.cosmo.BehavioralPattern.Command;

public class Client {

	public static void main(String[] args) {
		AbstractCmd ac = new GzipCompressCmd();
		Invoker invoker = new Invoker(ac);
		invoker.execute("d:\\temp", "d:\\temp.zip");
	}
}
