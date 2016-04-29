package com.cosmo.StructuralPattern.Proxy;

public class Client {

	public static void main(String[] args) {
		IRunner liu = new Runner();
		IRunner agent = new RunnerAgent(liu);
		System.out.println("跑步嗎？");
		agent.run();
	}
}
