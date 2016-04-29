package com.cosmo.StructuralPattern.Decorator;

import com.cosmo.StructuralPattern.Proxy.IRunner;

public class RunnerWithJet implements IRunner {

	private IRunner runner;

	public RunnerWithJet(IRunner runner) {
		this.runner = runner;
	}

	@Override
	public void run() {
		System.out.println("加快速度，增加噴射引擎");
		runner.run();
	}

}
