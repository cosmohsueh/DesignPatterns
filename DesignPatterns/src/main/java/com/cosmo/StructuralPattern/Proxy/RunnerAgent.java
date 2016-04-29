package com.cosmo.StructuralPattern.Proxy;

import java.util.Random;

public class RunnerAgent implements IRunner {

	private IRunner runner;

	public RunnerAgent(IRunner runner) {
		this.runner = runner;
	}

	@Override
	public void run() {
		Random random = new Random();
		if (random.nextBoolean()) {
			System.out.println("代理人同意運動員跑步");
			runner.run();
		} else {
			System.out.println("代理人不同意");
		}
	}

}
