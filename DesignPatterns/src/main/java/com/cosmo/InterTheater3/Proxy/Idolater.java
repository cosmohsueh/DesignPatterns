package com.cosmo.InterTheater3.Proxy;

public class Idolater {

	public static void main(String[] args) {
		IStar star = new Singer();
		IStar agent = new Agent(star);
		agent.sign();
	}
}
