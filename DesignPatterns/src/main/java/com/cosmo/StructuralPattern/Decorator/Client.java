package com.cosmo.StructuralPattern.Decorator;

import com.cosmo.StructuralPattern.Proxy.IRunner;
import com.cosmo.StructuralPattern.Proxy.Runner;

public class Client {

	public static void main(String[] args) {
		IRunner liu = new Runner();
		liu = new RunnerWithJet(liu);
		System.out.println("增強後");
		liu.run();
	}
}
