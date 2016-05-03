package com.cosmo.InterTheater2.Facade;

import java.util.Random;

public class Performance {

	private BasicSalary salary = new BasicSalary();

	public int getPerformance() {
		int perf = new Random().nextInt(100);
		return salary.getBasicSalary() * perf / 100;
	}
}
